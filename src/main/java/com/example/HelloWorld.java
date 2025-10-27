package com.example;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import java.awt.Font;

public class HelloWorld {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> createAndShowGUI());
    }

    private static void createAndShowGUI() {
        // Create the main frame
        JFrame frame = new JFrame("Hello World Application");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);

        // Create a label with "Hello World" text
        JLabel label = new JLabel("Hello World", SwingConstants.CENTER);
        label.setFont(new Font("Arial", Font.BOLD, 24));

        // Add the label to the frame
        frame.add(label);

        // Center the frame on screen and make it visible
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}