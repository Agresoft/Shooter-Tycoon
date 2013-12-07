package Agresoft.ShooterTycoon.tabs;

import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

import Agresoft.ShooterTycoon.Game;

public class mainGame extends JPanel {

	private static final long serialVersionUID = 1L;

	public static String VERSION = Game.VERSION;

	public static double cash = Game.cash;
	public static int bullets = Game.bullets;
	public static int bullet_limit = Game.bullet_limit;

	public static final Icon bullet_pistol_1 = new ImageIcon(Game.class.getResource("/Agresoft/ShooterTycoon/res/bullets/Bullet_Pistol.png"));
	public static final Icon bullet_pistol_2 = new ImageIcon(Game.class.getResource("/Agresoft/ShooterTycoon/res/bullets/Bullet_Pistol_2.png"));

	public JLabel lblBullets = new JLabel("You have made " + bullets + " of " + bullet_limit + " Bullets!");
	public JLabel lblMoney = new JLabel("You have made " + cash + " Dollars");
	public Border emptyBorder = BorderFactory.createEmptyBorder();

	public mainGame() {
		setBorder(new EmptyBorder(5, 5, 5, 5));
		setLayout(null);

		final JButton bulletCreate = new JButton(bullet_pistol_1);
		bulletCreate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Game.addBullets();

			}
		});
		bulletCreate.setContentAreaFilled(false);
		bulletCreate.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent arg0) {
				bulletCreate.setIcon(bullet_pistol_2);
			}

			public void mouseReleased(MouseEvent e) {
				bulletCreate.setIcon(bullet_pistol_1);
			}
		});
		bulletCreate.setBackground(SystemColor.text);
		bulletCreate.setBounds(487, 270, 114, 125);
		bulletCreate.setBorder(emptyBorder);
		add(bulletCreate);

		lblBullets.setBounds(34, 69, 231, 14);
		add(lblBullets);

		lblMoney.setBounds(34, 103, 231, 14);
		add(lblMoney);

		JButton btnSellbutton = new JButton("Sell Bullets");
		btnSellbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Game.sellBullets();
			}
		});
		btnSellbutton.setBounds(34, 159, 113, 23);
		add(btnSellbutton);
		
		
	}

}