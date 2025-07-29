package JavaCore;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Layout
{
    public static void main(String[] args) {
        JFrame frame = new JFrame("Layout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 500);


        // FlowLayout Example
        frame.setLayout(new FlowLayout());
        frame.add(new JButton("One"));
        frame.add(new JButton("Two"));
        frame.add(new JButton("Three"));

        //BorderLayout
        frame.setLayout(new BorderLayout());
        frame.add(new JButton("North"), BorderLayout.NORTH);
        frame.add(new JButton("South"), BorderLayout.SOUTH);
        frame.add(new JButton("East"), BorderLayout.EAST);
        frame.add(new JButton("West"), BorderLayout.WEST);

        //GridLayout
        frame.setLayout(new GridLayout(2,2));
        frame.add(new JButton("Yellow"));
        frame.add(new JButton("Red"));
        frame.add(new JButton("Green"));
        frame.add(new JButton("Blue"));

        //GridBagLayout
        frame.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        frame.add(new JButton("Button 1"), gbc);

        gbc.gridx =1;
        frame.add(new JButton("Button 2"), gbc);

        frame.setVisible(true);
    }
}
