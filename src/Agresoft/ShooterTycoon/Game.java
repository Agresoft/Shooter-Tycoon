package Agresoft.ShooterTycoon;

import Agresoft.ShooterTycoon.tabs.Skills;
import Agresoft.ShooterTycoon.tabs.UpgradeTab;
import Agresoft.ShooterTycoon.tabs.mainGame;

import java.awt.EventQueue;
import javax.swing.JFrame;

import javax.swing.JLabel;
import javax.swing.JTabbedPane;

public class Game extends JFrame {
	private static final long serialVersionUID = 1L;

	public static mainGame mainGame = new mainGame();
	public static UpgradeTab upTab = new UpgradeTab();
	public static Skills skTab = new Skills();

	private static JTabbedPane pane = new JTabbedPane();

	public static final String VERSION = "0.0.5_15";

	public static int bulletCreateRate = 1;
	public static double bulletSellRate = 10;
	public static int bullets = 0;
	public static int xpGain = 1;
	public static long cents = 0L;
	public static String cash = "$" + (cents / 100) + "." + (cents % 100);
	public static int bullet_limit = 250;


	private final JLabel lblNewLabel = new JLabel(VERSION);

	public Game() {

		setTitle("Shooter Tycoon");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1100, 688);
		setLocationRelativeTo(null);

		lblNewLabel.setBounds(10, 607, 166, 14);
		mainGame.add(lblNewLabel);

		pane.add("Main", mainGame);
		pane.add("Upgrades", upTab);
		pane.add("Skills", skTab);

		getContentPane().add(pane);

	}

	// The main method

	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					updateLabels();
					Game frame = new Game();
					frame.setVisible(true);
	} catch (Exception e) {
		e.printStackTrace();
	}
}
});
	}

	// Self explanatory, adds bullets.
	public static void addBullets() {
		if (bullets + bulletCreateRate < bullet_limit) {
			bullets += bulletCreateRate;
			upTab.createLevelXP+= xpGain;
			if(upTab.levelUpCreate() ) {
				bulletSellRate = Math.floor(bulletSellRate * 1.25);
				if(upTab.createLevel % 3 == 0)
					bulletCreateRate++;
				if(upTab.createLevel % 4 == 0)
					xpGain++;
			}
		}
		updateLabels();
	}

	// Also pretty self explanatory, sells your current bullets.
	public static void sellBullets() {
		if (bullets > 0) {
			if (cents%100 > 0 && cents%100 <= 9)
				cash = "$" + (cents / 100) + ".0" + (cents % 100);
			cents += bullets * bulletSellRate;
			bullets = 0;
			updateLabels();
		}
	}

	public static void updateLabels() {
		if(cents%100 > 0 && cents%100 <= 9)
			cash = "$" + (cents / 100) + ".0" + (cents % 100);
		else
			cash = "$" + (cents / 100) + "." + (cents % 100);
		mainGame.lblMoney.setText(cash);
		mainGame.lblBullets.setText(bullets + " of " + bullet_limit + " Bullets");
		mainGame.lblValue.setText("Value: $" + (bulletSellRate / 100) + "0");
		upTab.lblMoney2.setText("You have: " + cash);
		mainGame.lblLevel.setText("Level: " + upTab.createLevel);
		mainGame.lblLevel.setToolTipText(upTab.createLevelXP +  "/" + upTab.xpForLevel(upTab.createLevel) + " xp to next level");
		skTab.createLevelLbl.setText("Level: " + upTab.createLevel);
		skTab.createLevelXpLbl.setText("XP To Next: " + upTab.createLevelXP + "/" + upTab.xpForLevel(upTab.createLevel));
		skTab.createProgress.setText(Math.round(upTab.createLevelXP / (upTab.xpForLevel(upTab.createLevel)) * 100) + "% to Next Level");

	}

}
