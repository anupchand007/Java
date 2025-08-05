package EXAM_PREPARE.JAVA_SWING;

import javax.swing.*;
import java.awt.*;

public class P2_GUI_CONTROLS {
    public static void main(String[] args) {
        JFrame frame  = new JFrame("Swing GUI");
        frame.setSize(1000, 1000);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        JLabel l1= new JLabel("Enter Your UserName");
        panel.add(l1);
        JTextField t1 = new JTextField(20);
        t1.setMaximumSize(new java.awt.Dimension(200, 100));
        panel.add(t1);

        JLabel l3  = new JLabel("Enter Your password");
        JPasswordField password = new JPasswordField(20);
        password.setMaximumSize(new java.awt.Dimension(200, 200));
        panel.add(l3);
        panel.add(password);

        JLabel l2 = new JLabel("Do You have Hobbies?");
        JCheckBox c1 = new JCheckBox("Yes");
        JCheckBox c2= new JCheckBox("No");
        JCheckBox c3 = new JCheckBox("Yes But No...");
        panel.add(l2);
        panel.add(c1);
        panel.add(c2);
        panel.add(c3);


        panel.add(new JLabel("Please Select your Gender"));
        JRadioButton male = new JRadioButton("Male");
        JRadioButton female = new JRadioButton("Female");

        ButtonGroup group = new ButtonGroup();
        group.add(male);
        group.add(female);

        panel.add(male);
        panel.add(female);

        panel.add(new JLabel("Enter your Religion"));
        String[] Religious = {"Hindu", "Buddhist", "Muslim"};
        JComboBox <String> combo = new JComboBox<>(Religious);
        combo.setMaximumSize(new java.awt.Dimension(200, 100));
        panel.add(combo);

        JSlider slider = new JSlider(0, 100, 50);
        panel.add(slider);

        panel.setBorder(BorderFactory.createTitledBorder("Login Panel"));

        JLabel l4 =new JLabel("How do U feel about us!!!");
        JTextArea t2 = new JTextArea(30, 20 );
        JScrollPane scrollPane = new JScrollPane(t2);
        panel.add(l4);
        panel.add(t2);
        panel.add(scrollPane);

        frame.add(panel);
        frame.setVisible(true);
    }
}
