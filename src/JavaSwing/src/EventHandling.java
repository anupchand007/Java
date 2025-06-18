import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventHandling {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JFrame Demo");
        frame.setSize(300,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JPanel panel = new JPanel();

        JButton btn = new JButton("Click me");
        btn.setBackground(Color.green);

        JLabel label = new JLabel("This is a Event Handling Label");

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showConfirmDialog(btn, "Welcome to Java Swing GUI" );
//                JOptionPane.showMessageDialog(btn, "Welcome to Java Swing GUI" );
//                JOptionPane.showInputDialog(btn, "Welcome to Java Swing GUI" );
//                JOptionPane.showInternalConfirmDialog(btn, "Welcome to Java Swing GUI" );
                label.setText("Welcome to Java Swing GUI");
            }
        });

        panel.add(label);
        panel.add(btn);

        frame.add(panel);
        frame.setVisible(true);
    }

}


