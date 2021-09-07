package App;

import javax.swing.*;
import java.awt.*;

public class GameWindow extends JFrame {
    JPanel mainPanel;
    JPanel buttonPanel;

    GameWindow() {
        setupWindow();
        setupMainPanel();
        setupButtonPanel();
        add(mainPanel);
        add(buttonPanel, BorderLayout.SOUTH);

    }

    private void setupButtonPanel() {
        JButton yesButton = new JButton("YES");
        JButton noButton = new JButton("NO");
        buttonPanel = new JPanel();
        buttonPanel.add(yesButton);
        buttonPanel.add(noButton);
    }

    private void setupMainPanel() {
        mainPanel = new JPanel(new BorderLayout());
        JLabel question = new JLabel("Two bear or not two bear?", SwingConstants.CENTER);
        mainPanel.add(question, BorderLayout.CENTER);
    }

    private void setupWindow() {
        setSize(800, 600);
        setLocationRelativeTo(null); // position center
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
}
