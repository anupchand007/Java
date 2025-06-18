import javax.swing.*;
import java.awt.*;

public class JFrameDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JFrame Demo");
        frame.setSize(300,600);
        frame.setResizable(false);
        frame.setAlwaysOnTop(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JPanel panel = new JPanel();
        panel.setBackground(Color.orange);

        JButton btn = new JButton("Click me");
        btn.setBackground(Color.green);

        panel.add(btn);

        frame.add(panel);


        frame.setVisible(true);
    }
}
