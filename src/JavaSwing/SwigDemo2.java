package JavaSwing;

import javax.swing.*;

public class SwigDemo2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("SwingDemo2");
        frame.setSize(1800, 900);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JPanel panel = new JPanel();

        JLabel label = new JLabel("This is a Swing Demo 2");
        JButton btn = new JButton("Yellow, I mean Hello!");

        panel.add(label);
        panel.add(btn);

        frame.add(panel);

        frame.setVisible(true);
    }
}

