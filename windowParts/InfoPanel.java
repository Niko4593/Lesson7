package Lesson7.windowParts;

import Lesson7.MainWindow;
import Lesson7.windowParts.areas.GameControlArea;
import Lesson7.windowParts.areas.GameInfoArea;
import Lesson7.windowParts.areas.PlayerControlArea;
import Lesson7.windowParts.areas.PlayerInfoArea;

import javax.swing.*;
import java.awt.*;

public class InfoPanel extends JPanel {

    private GameControlArea gameControlArea;
    private GameInfoArea gameInfoArea;
    private PlayerInfoArea playerInfoArea;
    private PlayerControlArea playerControlArea;

    private JTextArea logs;
    private JScrollPane scrollBox;

    private MainWindow mainWindow;

    public InfoPanel(MainWindow mainWindow) {
        this.mainWindow = mainWindow;
        setLayout(new GridLayout(5, 1));

        createParts();
        createLogArea();

        add(gameControlArea);
        add(gameInfoArea);
        add(playerInfoArea);
        add(playerControlArea);
        add(scrollBox);
    }

    private void createParts() {
        gameControlArea = new GameControlArea(this);
        gameInfoArea = new GameInfoArea(this);
        playerInfoArea = new PlayerInfoArea();
        playerControlArea = new PlayerControlArea(this);
    }

    private void createLogArea() {
        logs = new JTextArea();
        logs.setEditable(false);
        logs.setLineWrap(true);
        scrollBox = new JScrollPane(logs);
    }

    public void launchGame() {
        mainWindow.launchGame();
    }

    public void recordLog(String msg) {
        logs.append(msg + "\n");
    }

    public void refreshInfo(GameMap map) {
        gameInfoArea.refreshFields(map.getSizeMap(), map.getLevelCount(), map.getCountEnemies());
        playerInfoArea.refreshFields(map.getPlayer());
    }

    public void updatePlayer(int key) {
        mainWindow.updatePlayer(key);
    }
}
