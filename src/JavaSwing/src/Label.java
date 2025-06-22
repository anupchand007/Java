import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.*;

public class Label {
    public static void main(String[] args) {
        JFrame frame = new JFrame("This is demo for Label");
        frame.setSize(400,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("This is a Demo Label on the Project");
        label.setForeground(Color.red);
        label.setSize(400, 50);
        label.setToolTipText("This is a demo");
        JPanel panel = new JPanel();
        JButton btn = new JButton("Click me");

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(btn,"This is a Demo for lable ");
            }
        });

        panel.add(label);
        panel.add(btn);

        frame.add(panel);
        frame.setVisible(true);
    }
}
