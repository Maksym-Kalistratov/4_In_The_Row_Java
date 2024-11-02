package Game;
import Engine.Engine;
import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {

    public GamePanel() {

        setBackground(Color.WHITE);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g;
        drawBackground(g2d);

        drawCircles(g2d);
        drawText(g2d);
    }

    private void drawBackground(Graphics2D g2d) {

        int width = getWidth();
        int height = getHeight();

        int squareSize = Math.min(width, height);

        int x = (width - squareSize) / 2;
        int y = (height - squareSize) / 2;

        g2d.setColor(Color.decode("#2f247d"));
        g2d.fillRect(x, y, squareSize, squareSize);

        g2d.setColor(Color.DARK_GRAY);
        g2d.setStroke(new BasicStroke(5));
        g2d.drawRect(x, y, squareSize, squareSize);
    }

    private void drawCircles(Graphics2D g2d) {
        int width = getWidth();
        int height = getHeight();

        int squareSize = Math.min(width, height);

        int x = (width - squareSize) / 2;
        int y = (height - squareSize) / 2;

        int rows = 6;
        int cols = 7;
        int circlePadding = 20;
        int circleDiameter = (squareSize - circlePadding * (cols + 1)) / cols;

        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                int circleX = x + circlePadding + i * (circleDiameter + circlePadding);
                int circleY = y + circlePadding + j * (circleDiameter + circlePadding);
                int colorInd = Engine.getColor(j,i);
                if (colorInd == 1) g2d.setColor(Color.RED);
                else if (colorInd == 2) g2d.setColor(Color.BLUE);
                else g2d.setColor(Color.WHITE);

                g2d.fillOval(circleX, circleY, circleDiameter, circleDiameter);
                g2d.setColor(Color.DARK_GRAY);
                g2d.setStroke(new BasicStroke(4));
                g2d.drawOval(circleX, circleY, circleDiameter, circleDiameter);
            }
        }
    }
    private void drawText(Graphics2D g2d){
    String color = (Engine.getTurn() == 1)? "Red":"Blue";
    g2d.setFont(new Font("Arial", Font.BOLD, 24));
    g2d.setColor(Color.BLACK);
    g2d.drawString(color + "'s turn!", 50, 750);
    g2d.drawString(Engine.getCount(0) + " : "+ Engine.getCount(1), 720, 750);
    }
}
