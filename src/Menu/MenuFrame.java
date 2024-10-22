package Menu;


import javax.swing.*;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;


public class MenuFrame extends JFrame implements KeyListener {
    public MenuFrame() {
        setTitle("Main Menu");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(450, 400);

        add(new MenuPanel(this));

        addKeyListener(this);
        setLocationRelativeTo(null);
        setFocusable(true);
        setVisible(true);

    }


    @Override
    public void keyTyped(KeyEvent e) {

    }
    public void keyPressed(KeyEvent e) {

        if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
            System.exit(0);
        }
    }
    public void keyReleased(KeyEvent e) {

    }
}