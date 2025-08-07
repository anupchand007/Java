package EXAM_PREPARE.P2_JAVA_SWING;

import javax.swing.*;

public class P1_LAYOUT_MANAGER {
    public static void main(String[] args) {
        JFrame f = new JFrame("This is a Java Frame");
        f.setSize(500, 500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


//        //FlowLayout
//        f.setLayout(new FlowLayout());
//        f.add(new JButton("One"));
//        f.add(new JButton("Two"));
//        f.add(new JButton("Three"));
//
//        //BorderLayout
//        f.setLayout(new BorderLayout());
//        f.add(new JButton("First"), BorderLayout.NORTH);
//        f.add(new JButton("Second"), BorderLayout.EAST);
//        f.add(new JButton("Third"), BorderLayout.WEST);
//        f.add(new JButton("Forth"), BorderLayout.SOUTH);
//
//        //GridLayout
//        f.setLayout(new GridLayout(2,2));
//        f.add(new JButton("0,0"));
//        f.add(new JButton("0,1"));
//        f.add(new JButton("1,0"));
//        f.add(new JButton("1,1"));
//
//        //GridBaglayout
//        f.setLayout(new GridBagLayout());
//        GridBagConstraints gbc = new GridBagConstraints();
//        gbc.gridy = 0;
//        gbc.gridx = 0;
//        f.add(new JButton("0,0"), gbc);
//        gbc.gridy = 0;
//        gbc.gridx = 1;
//        f.add(new JButton("0,1"), gbc);
//        gbc.gridy = 1;
//        gbc.gridx = 0;
//        f.add(new JButton("1,0"), gbc);

        //NoLayout
        JButton b = new JButton("One");
        JButton b2 = new JButton("Two");
        b.setBounds(0, 1 , 10, 20);
        b2.setBounds(1, 0, 35, 40);
        f.add(b);
        f.add(b2);

        f.setVisible(true);
    }
}
