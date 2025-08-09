package EXAM_PREPARE.P2_JAVA_SWING;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Scanner;

public class Pratice {
    public static void main(String[] args) {
        JFrame f =new JFrame("Find Factorail");
        f.setSize(900, 900);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(new GridLayout());

        JLabel l1= new JLabel("Enter the Number");
        JTextField t1 = new JTextField();
        JLabel l2 = new JLabel("Your Result is: ");
        JTextField t2 = new JTextField();
        t2.setEditable(false);

        JButton btn = new JButton("Calculate");
        btn.setMaximumSize(new java.awt.Dimension(50, 50));

        btn.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
               try{
                   int number = Integer.parseInt(t1.getText());

                   if( number < 0 ){
                       t2.setText("Invalid Number");
                   }
                   int fact = 1;
                   for(int i=1; i<=number; i++){
                       fact *= i;

                   }
                   t2.setText(String.valueOf(fact));
               }catch (Exception ex){
                   t2.setText("Invaild Number" + ex.getMessage());

               }
            }
        });

        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.add(btn);

        f.setVisible(true);
    }
}
