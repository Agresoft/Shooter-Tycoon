package Agresoft.ShooterTycoon.tabs;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class Skills extends JPanel {

    public static JLabel lblCreate = new JLabel("Skill in Bullet Creation: ");
    public static JLabel createLevelLbl = new JLabel();
    public static JLabel createLevelXpLbl = new JLabel();
    public static JLabel createProgress = new JLabel();

    public Skills() {
        setBorder(new EmptyBorder(5, 5, 5, 5));
        setLayout(null);

        createLevelXpLbl.setBounds(30, 45, 325, 14);
        add(createLevelXpLbl);

        lblCreate.setBounds(10, 11, 325, 14);
        add(lblCreate);

        createLevelLbl.setBounds(30, 30, 325, 14);
        add(createLevelLbl);

        createProgress.setBounds(30, 60, 325, 14);
        add(createProgress);

    }
}
