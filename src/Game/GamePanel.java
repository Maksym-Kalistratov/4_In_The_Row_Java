package Game;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {

    public GamePanel() {

        setBackground(Color.WHITE);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g;

        // Получаем размеры панели
        int width = getWidth();
        int height = getHeight();

        // Устанавливаем отступы
        int padding = 50;

        // Рассчитываем размер квадрата в зависимости от размера окна
        int squareSize = Math.min(width, height);

        // Рассчитываем позицию квадрата (чтобы он был по центру)
        int x = (width - squareSize) / 2;
        int y = (height - squareSize) / 2;

        // Устанавливаем цвет для синего квадрата
        g2d.setColor(Color.BLUE);
        g2d.fillRect(x, y, squareSize, squareSize);

        // Устанавливаем цвет для темно-синего контура
        g2d.setColor(Color.DARK_GRAY);
        g2d.setStroke(new BasicStroke(5)); // Устанавливаем ширину линии контура
        g2d.drawRect(x, y, squareSize, squareSize);

        int rows = 6;
        int cols = 7;
        int circlePadding = 20; // Расстояние между кругами
        int circleDiameter = (squareSize - circlePadding * (cols + 1)) / cols; // Диаметр кругов

        // Устанавливаем цвет для белых кругов
        g2d.setColor(Color.WHITE);

        // Цикл для отрисовки 7 на 6 белых кругов
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                // Вычисляем координаты каждого круга
                int circleX = x + circlePadding + i * (circleDiameter + circlePadding);
                int circleY = y + circlePadding + j * (circleDiameter + circlePadding);

                // Рисуем круг
                g2d.fillOval(circleX, circleY, circleDiameter, circleDiameter);
            }
        }
    }
}