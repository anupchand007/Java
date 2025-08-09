package EXAM_PREPARE.P3_EVENT_HANDLING;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class P1_ACTION_COMMAND {
    public static void main(String[] args) {
        JFrame frame =  new JFrame("Event Handling");
        frame.setSize(800, 800);
        frame.setLayout(new FlowLayout());

        JButton btn = new JButton("1st Event!!");
        btn.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e){
                System.out.println("Clicked at: " + e.getButton());
            }
        });

        btn.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                System.out.println("Pressed :" + e.getButton());
            }
        });


        JTextField tf =new JTextField("Enter your text", 50);
        tf.addFocusListener(new FocusAdapter() {
            public void focusGained(FocusEvent e) {
                System.out.println("Focused gained : " + e.getCause());
            }
        });
        tf.addFocusListener(new FocusAdapter() {
            public void focusLost(FocusEvent e){
                System.out.println("Focus Lost : " + e.getCause());
            }
        });
        tf.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e){
                System.out.println("Key Pressed: "+ e.getKeyChar());
            }
        });

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("Window is Closing");
                System.exit(0);
            }
        });

        JCheckBox chk1 = new JCheckBox("Subscribe");
        chk1.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                System.out.println("Status changed to: " + e.getStateChange());
            }
        });

        frame.add(chk1);

        JButton btn2 = new JButton("Red");
        btn2.setActionCommand("Red");
        btn2.addActionListener(e-> {
          if(e.getActionCommand().equals("Red")){
              System.out.println("Red Button is clicked");
          }
        });

        frame.add(btn2);

        frame.add(tf);
        frame.add(btn);


        frame.setVisible(true);
    }
}
