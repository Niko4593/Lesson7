package Lesson7.windowParts.areas;

import Lesson7.windowParts.InfoPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameControlArea extends JPanel {

    private JButton startGame;
    private JButton exitGame;

    private InfoPanel infoPanel;

    public GameControlArea(InfoPanel infoPanel) {
        this.infoPanel = infoPanel;
        setLayout(new GridLayout(2, 1));

        startGame = new JButton("Start Game");

        startGame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                infoPanel.launchGame();
            }
        });

        exitGame = new JButton("Exit Game");
        exitGame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        add(startGame);
        add(exitGame);
    }
}