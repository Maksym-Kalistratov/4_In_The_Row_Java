package Game;
import Engine.Engine;
import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {
    private boolean redrawCirclesOnly = false;

    public GamePanel() {

        setBackground(Color.WHITE);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g;

        if (!redrawCirclesOnly) {
            drawBackground(g2d);
        }
        //redrawCirclesOnly = true;

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

    // Метод для отрисовки кругов
    private void drawCircles(Graphics2D g2d) {
        // Получаем размеры панели
        int width = getWidth();
        int height = getHeight();

        // Рассчитываем размер квадрата в зависимости от размера окна
        int squareSize = Math.min(width, height);

        // Рассчитываем позицию квадрата (чтобы он был по центру)
        int x = (width - squareSize) / 2;
        int y = (height - squareSize) / 2;

        // Параметры для кругов
        int rows = 6;
        int cols = 7;
        int circlePadding = 20; // Расстояние между кругами
        int circleDiameter = (squareSize - circlePadding * (cols + 1)) / cols; // Диаметр кругов

        // Цикл для отрисовки 7 на 6 белых кругов
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                // Вычисляем координаты каждого круга
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
    String color;
    if(Engine.getTurn() == 1) color = "Red";
    else color = "Blue";
        g2d.setFont(new Font("Arial", Font.BOLD, 24));
        g2d.setColor(Color.BLACK);
        g2d.drawString(color + "'s turn!", 50, 750);
    }
}