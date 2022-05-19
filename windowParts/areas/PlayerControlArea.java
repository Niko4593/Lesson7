package Lesson7.windowParts.areas;

import Lesson7.models.Player;
import Lesson7.windowParts.InfoPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PlayerControlArea extends JPanel {

    private JButton btnMoveUp;
    private JButton btnMoveLeft;
    private JButton btnMoveRight;
    private JButton btnMoveDown;

    private InfoPanel infoPanel;

    public PlayerControlArea(InfoPanel infoPanel) {
        this.infoPanel = infoPanel;
        setLayout(new GridLayout(2, 3));
        setBorder(BorderFactory.createLineBorder(Color.BLACK));

        btnMoveUp = new JButton("⮝"); // \uD83E\uDC45
        btnMoveUp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                infoPanel.updatePlayer(Player.MOVE_UP);
            }
        });

        btnMoveLeft = new JButton("⮜"); // \uD83E\uDC44
        btnMoveLeft.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                infoPanel.updatePlayer(Player.MOVE_LEFT);
            }
        });

        btnMoveRight = new JButton("⮞"); // \uD83E\uDC46
        btnMoveRight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                infoPanel.updatePlayer(Player.MOVE_RIGHT);
            }
        });

        btnMoveDown = new JButton("⮟"); // \uD83E\uDC47
        btnMoveDown.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                infoPanel.updatePlayer(Player.MOVE_DOWN);
            }
        });

        add(new JPanel());
        add(btnMoveUp);
        add(new JPanel());
        add(btnMoveLeft);
        add(btnMoveDown);
        add(btnMoveRight);
    }
}