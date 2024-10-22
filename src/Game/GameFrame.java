package Game;

import javax.swing.*;
import java.awt.*;

public class GameFrame extends JFrame {

    public GameFrame() {
        setTitle("4 in the row");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        GamePanel gamePanel = new GamePanel();
        setSize(800, 800);
        add(gamePanel);

        setLocationRelativeTo(null);
        setVisible(true);
    }

}