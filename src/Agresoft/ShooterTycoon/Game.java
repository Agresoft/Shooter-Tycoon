package Agresoft.ShooterTycoon;

import java.awt.EventQueue;

import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
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
import javax.swing.JLabel;
import javax.swing.JTabbedPane;

public class Game extends JFrame {
	private static final long serialVersionUID = 1L;

	private JPanel contentPane;

	public String VERSION = "0.0.2_3";

	public static int bulletCreateRate = 5;
	public static double bulletSellRate = 0.25;
	public static int bullets = 0;
	public static double cash = 0;

	private static final Icon bullet_pistol_1 = new ImageIcon(Game.class.getResource("/Agresoft/ShooterTycoon/res/bullets/Bullet_Pistol.png"));
	private static final Icon bullet_pistol_2 = new ImageIcon(Game.class.getResource("/Agresoft/ShooterTycoon/res/bullets/Bullet_Pistol_2.png"));

	private static JLabel lblBullets = new JLabel("You have made " + bullets + " Bullets!");
	private static JLabel lblMoney = new JLabel("You have made " + cash + " Money");

	private Border emptyBorder = BorderFactory.createEmptyBorder();

	public Game() {

		setTitle("Shooter Tycoon");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1100, 688);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		final JButton bulletCreate = new JButton(bullet_pistol_1);
		bulletCreate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				addBullets();

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
		bulletCreate.setBounds(483, 266, 128, 128);
		bulletCreate.setBorder(emptyBorder);
		contentPane.add(bulletCreate);

		lblBullets.setBounds(34, 69, 199, 14);
		contentPane.add(lblBullets);
		
		JLabel lblVersion = new JLabel("Version: " + VERSION);
		lblVersion.setBounds(10, 635, 113, 14);
		contentPane.add(lblVersion);
		

		lblMoney.setBounds(34, 103, 199, 14);
		contentPane.add(lblMoney);
		
		JButton btnSellbutton = new JButton("Sell Bullets");
		btnSellbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sellBullets();
			}
		});
		btnSellbutton.setBounds(34, 159, 113, 23);
		contentPane.add(btnSellbutton);
		
		
	}

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

	
	//Self explanatory, adds bullets.
	private void addBullets() {
		bullets += bulletCreateRate;
		lblBullets.setText("You have made " + bullets + " Bullets!");
	}
	
	//Also pretty self explanatory, sells your current bullets.
	private void sellBullets(){
		if(bullets > 0){
			cash += bullets * .25;
			bullets = 0;
			lblMoney.setText("You have made " + cash + " Dollars!");
			lblBullets.setText("You have made " + bullets + " Bullets!");
		}
	}
}
