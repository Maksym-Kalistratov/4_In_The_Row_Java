package Game;

import javax.swing.*;

public class InstructionsFrame extends JFrame {

    public InstructionsFrame() {
        setTitle("Instructions");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);


        InstructionsPanel instructionsPanel = new InstructionsPanel(this);
        add(instructionsPanel);

        setVisible(true);
    }

}
