package Lesson7.windowParts.areas;

import Lesson7.models.Player;

import javax.swing.*;
import java.awt.*;

public class PlayerInfoArea extends JPanel {

    private String prefixHP = "HP: ";
    private String prefixExp = "Exp: ";
    private String prefixPosition = "Pos: ";

    private JLabel playerHP;
    private JLabel playerExp;
    private JLabel playerPosition;

    public PlayerInfoArea() {
        setLayout(new GridLayout(4, 1));
        setBorder(BorderFactory.createLineBorder(Color.BLACK));

        playerHP = new JLabel(prefixHP + "-");
        playerExp = new JLabel(prefixExp + "-");
        playerPosition = new JLabel(prefixPosition + "-:-");

        add(new JLabel("= Player Info =", SwingConstants.CENTER));
        add(playerHP);
        add(playerExp);
        add(playerPosition);
    }

    public void refreshFields(Player player) {
        playerHP.setText(prefixHP + player.getHealth());
        playerExp.setText(prefixExp + player.getExp());
        playerPosition.setText(prefixPosition + player.getPosition());
    }
}