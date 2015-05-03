package Agresoft.ShooterTycoon.tabs;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class UpgradeTab extends JPanel{

    public static JLabel lblMoney2 = new JLabel();

    public static int createLevel = 1;
    public static long createLevelXP = 0;
    public static int xpGain = 1;

    public UpgradeTab() {
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

}
