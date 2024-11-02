package game;

import javax.swing.*;

public class InstructionsFrame extends JFrame {

    public InstructionsFrame(String message) {
        setTitle("Message");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);


        InstructionsPanel instructionsPanel = new InstructionsPanel(this, message);
        add(instructionsPanel);

        setVisible(true);
    }

}
