package Game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class GameFrame extends JFrame implements KeyListener, MouseListener {

    public GameFrame() {
        setTitle("4 in the row");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        GamePanel gamePanel = new GamePanel();
        setSize(800, 800);
        add(gamePanel);
        setResizable(false);
        addKeyListener(this);
        addMouseListener(this);
        setLocationRelativeTo(null);
        setFocusable(true);
        setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {}
    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        if (keyCode == KeyEvent.VK_ESCAPE) {
            System.exit(0);
        }
        if (keyCode >= KeyEvent.VK_1 && keyCode <= KeyEvent.VK_7) {
            System.out.println("Key Typed: " + KeyEvent.getKeyText(keyCode));
        }
    }
    @Override
    public void keyReleased(KeyEvent e) {}
    @Override
    public void mouseClicked(MouseEvent e) {

        int windowWidth = getWidth();

        int mouseX = e.getX();

        int zoneWidth = windowWidth / 7;

        int zone = (mouseX / zoneWidth) + 1;

        System.out.println("Mouse clicked in zone: " + zone);
    }

    @Override
    public void mousePressed(MouseEvent e) {}

    @Override
    public void mouseReleased(MouseEvent e) {}

    @Override
    public void mouseEntered(MouseEvent e) {}

    @Override
    public void mouseExited(MouseEvent e) {}


}