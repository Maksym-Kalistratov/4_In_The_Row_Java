package Game;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InstructionsPanel extends JPanel {

    public InstructionsPanel(JFrame parentFrame, String message) {
        BoxLayout box = new BoxLayout(this, BoxLayout.Y_AXIS);
        setLayout(box);
        setBackground(Color.WHITE);
        setAlignmentX(Component.CENTER_ALIGNMENT);

        // Instruction text
        JTextArea instructionsText = new JTextArea(message);
        instructionsText.setEditable(false);
        instructionsText.setBackground(Color.LIGHT_GRAY);
        instructionsText.setFont(new Font("Arial", Font.PLAIN, 14));
        instructionsText.setAlignmentX(Component.CENTER_ALIGNMENT);

        // Just in case text is too long
        JScrollPane scrollPane = new JScrollPane(instructionsText);
        scrollPane.setPreferredSize(new Dimension(300, 150));
        //scrollPane.setMaximumSize(new Dimension(300, 150));
        scrollPane.setAlignmentX(Component.CENTER_ALIGNMENT);

        JButton okButton = createButton("OK", e -> parentFrame.dispose());
        okButton.setAlignmentX(Component.CENTER_ALIGNMENT);

        add(scrollPane);
        add(Box.createRigidArea(new Dimension(0, 20)));
        add(okButton);
    }

    private JButton createButton(String text, ActionListener actionListener) {
        JButton button = new JButton(text);
        button.addActionListener(actionListener);
        button.setPreferredSize(new Dimension(100, 30));
        button.setMaximumSize(new Dimension(100, 30));
        button.setBackground(Color.BLUE);
        button.setForeground(Color.WHITE);
        button.setOpaque(true);
        button.setBorderPainted(false);
        return button;
    }
}
