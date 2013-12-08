package Agresoft.ShooterTycoon;

import java.awt.EventQueue;

import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.math.BigDecimal;

import javax.swing.JLabel;
import javax.swing.JTabbedPane;
import javax.swing.JScrollBar;
import javax.swing.JProgressBar;

public class Game extends JFrame {
	private static final long serialVersionUID = 1L;

	private static Agresoft.ShooterTycoon.tabs.mainGame mainGame = new Agresoft.ShooterTycoon.tabs.mainGame();

	private static JPanel upgradeScreen = new JPanel();

	private static JTabbedPane pane = new JTabbedPane();

	public static String VERSION = "0.0.3_7";

	public static int bulletCreateRate = 4;
	public static double bulletSellRate = 10;
	public static int bullets = 0;
	public static int cents = 0;
	public static String cash = "$" + (cents / 100) + "." + (cents % 100);
	public static int bullet_limit = 250;

	public static JLabel lblMoney2 = new JLabel("You have: " + cash + " Dollars to spend.");
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
		pane.add("Upgrades", upgradeScreen);
		upgradeScreen.setLayout(null);

		lblMoney2.setBounds(10, 11, 325, 14);
		upgradeScreen.add(lblMoney2);

		getContentPane().add(pane);

	}

	// The main method

	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
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
		}
		mainGame.lblBullets.setText("You have made " + bullets + " of " + bullet_limit + " Bullets!");
	}

	// Also pretty self explanatory, sells your current bullets.
	public static void sellBullets() {
		if (bullets > 0) {
			if (cents%100 >= 0 && cents%100 <= 9){
				cash = "$" + (cents / 100) + ".0" + (cents % 100);
			}
			cents += bullets * bulletSellRate;
			bullets = 0;
			cash = "$" + (cents / 100) + "." + (cents % 100);
			mainGame.lblMoney.setText("You have made " + cash);
			mainGame.lblBullets.setText("You have made: " + bullets + " of " + bullet_limit + " Bullets!");
			lblMoney2.setText("You have: " + cash + " Dollars to spend.");
		}

	}

	public static void convertCents() {
		if (cents%100 >= 0 && cents%100 <= 9){
			cash = "$" + (cents / 100) + ".0" + (cents % 100);
		}
	}

}
