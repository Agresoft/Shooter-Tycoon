package Agresoft.ShooterTycoon.tabs;

import Agresoft.ShooterTycoon.Game;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class UpgradeTab extends JPanel{
    public static String cash = Game.cash;

    public static JLabel lblMoney2 = new JLabel("You have: " + cash + " Dollars to spend.");


    public static int createLevel = 1;
    public static long createLevelXP = 0;

    public static JLabel lblXP = new JLabel(createLevelXP +  "/" + xpForLevel(createLevel) + " xp to next level");
    public static JLabel lblLevel = new JLabel("Bullet Create Level: " + createLevel);

    public UpgradeTab() {
        setBorder(new EmptyBorder(5, 5, 5, 5));
        setLayout(null);

        lblMoney2.setBounds(10, 11, 325, 14);
        add(lblMoney2);

        lblXP.setBounds(10, 31, 325, 14);
        add(lblXP);

        lblLevel.setBounds(10, 51, 325, 14);
        add(lblLevel);

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

}
