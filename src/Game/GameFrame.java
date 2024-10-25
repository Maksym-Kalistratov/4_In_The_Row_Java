package Game;
import Engine.Engine;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class GameFrame extends JFrame implements KeyListener, MouseListener {
    private GamePanel gamePanel = new GamePanel();

    public GameFrame() {
        setTitle("4 in the row");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


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
            int i = keyCode-KeyEvent.VK_0;
            System.out.println("Key Typed: " + i);
            if (Engine.nextMove(i) == 0) {
                gamePanel.repaint();
                int state = Engine.getState();
                if(state != 0){
                    String message = (state == 1)? "Red":"Blue";
                    new InstructionsFrame(state + "Wins!\n" +
                            "Press OK to start new game");
                }
            }
            else new InstructionsFrame("Illegal move! \n" +
                    "This collum is already full!");
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
        if (Engine.nextMove(zone) == 0) {
            gamePanel.repaint();
           int state = Engine.getState();
            if(state != 0){
                String message = (state == 1)? "Red":"Blue";
                new InstructionsFrame(state + "Wins!\n" +
                        "Press OK to start new game");
            }
        }
        else new InstructionsFrame("Illegal move! \n" +
                "This collum is already full!");
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