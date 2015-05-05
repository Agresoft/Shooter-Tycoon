package Agresoft.ShooterTycoon.tabs;

import Agresoft.ShooterTycoon.Game;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UpgradeTab extends JPanel{

    public static JLabel lblMoney2 = new JLabel();

    public static int createLevel = 1;
    public static long createLevelXP = 0;

    public static final Icon btnUpOne = new ImageIcon(Game.class.getResource("/Agresoft/ShooterTycoon/res/buttons/btnUpgradeOne.png"));
    public static final Icon btnUpOneD = new ImageIcon(Game.class.getResource("/Agresoft/ShooterTycoon/res/buttons/btnUpgradeOneD.png"));

    public static final JButton btnUpgradeOne = new JButton(btnUpOne);


    public UpgradeTab() {

        btnUpgradeOne.setToolTipText("+1 bullet per click\n  " + "+ 25% bullet value");
        btnUpgradeOne.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                upgradeOne();
            }
        });
        btnUpgradeOne.setBounds(10, 40, 175, 50);
        btnUpgradeOne.setPressedIcon(btnUpOneD);
        btnUpgradeOne.setRolloverEnabled(false);
        add(btnUpgradeOne);

        setBorder(new EmptyBorder(5, 5, 5, 5));
        setLayout(null);

        lblMoney2.setBounds(10, 11, 325, 14);
        add(lblMoney2);
    }

    public static boolean levelUpCreate() {
        if(createLevelXP >= xpForLevel(createLevel)){
            createLevel++;
            createLevelXP = 0;
            return true;
        }
        return false;
    }

    public static double xpForLevel(int level){
        double total = 0;
        for(int i = 0; i < level; i++){
            total += Math.floor(i + 300 * Math.pow(2, i/ 10.0));
        }
        return Math.floor(total / 10);
    }

    public static void upgradeOne() {
        if(Game.cents >= 2500) {
            Game.cents -= 2500;
            Game.bulletCreateRate++;
            Game.bulletSellRate = Math.floor(Game.bulletSellRate * 1.25);
            Game.updateLabels();
        }
    }
}
