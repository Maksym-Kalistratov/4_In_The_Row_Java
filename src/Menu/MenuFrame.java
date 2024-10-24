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
    @Override
    public void keyPressed(KeyEvent e) {

        if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
            setFocusable(false);
            System.exit(0);
        }
    }
    @Override
    public void keyReleased(KeyEvent e) {

    }
}