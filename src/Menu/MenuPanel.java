package Menu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class MenuPanel extends JPanel {

    public MenuPanel(JFrame Menuframe) {
        GridBagLayout gbl = new GridBagLayout();
        setLayout(gbl);
        setPreferredSize(new Dimension(450, 400));
        setBackground(Color.WHITE);


        GridBagConstraints cnstr = new GridBagConstraints();
        cnstr.ipadx = 30;
        cnstr.ipady = 5;
        cnstr.gridx = 0;
        cnstr.gridy = 0;
        cnstr.weighty = 0.5;
        cnstr.fill = GridBagConstraints.BOTH;

        ImageIcon icon = new ImageIcon("src/Textures/Menu_Screensaver.png");
        JLabel image = new JLabel(icon);
        add(image, cnstr);

        cnstr.gridy++;
        cnstr.fill = GridBagConstraints.HORIZONTAL;


        JButton Play = createButton("Play", e -> {
            Menuframe.dispose();
        });

        JButton Exit = createButton("Exit", e -> {
            System.exit(0);
        });
        if (((int)(Math.random() * 2) + 1) == 1){
            Play.setBackground(Color.RED);
            Play.setForeground(Color.BLUE);
            Exit.setBackground(Color.BLUE);
            Exit.setForeground(Color.RED);
        } else {
            Play.setBackground(Color.BLUE);
            Play.setForeground(Color.RED);
            Exit.setBackground(Color.RED);
            Exit.setForeground(Color.BLUE);
        }
        add(Play, cnstr);
        cnstr.gridy++;
        add(Exit, cnstr);

    }

    private JButton createButton(String text, ActionListener actionListener) {
        JButton button = new JButton(text);
        button.addActionListener(actionListener);
        button.setPreferredSize(new Dimension(50, 30));
        button.setMaximumSize(new Dimension(50, 30));
        button.setMinimumSize(new Dimension(50, 30));
        button.setBackground(Color.BLACK);
        button.setForeground(Color.WHITE);
        button.setOpaque(true);
        button.setBorderPainted(false);
        return button;
    }
}

