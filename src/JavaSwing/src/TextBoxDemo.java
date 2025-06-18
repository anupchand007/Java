import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextBoxDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Text Box Demo");
        frame.setSize(300,300);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        JLabel label = new JLabel("This is a Demo for text box");
        JLabel FirstName = new JLabel("Enter your First Name");
        JTextField firstField = new JTextField(20);
        JLabel LastName = new JLabel("Enter your Last Name");
        JTextField lastField = new JTextField(20);
        firstField.setMaximumSize(new Dimension(200,30));
        lastField.setMaximumSize(new Dimension(200,30));

        JButton btn = new JButton("Submit");

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(firstField.getText().trim().isEmpty() || lastField.getText().trim().isEmpty()){
                    JOptionPane.showMessageDialog(btn, "Please enter your Both names");
                }
                else{
                    JOptionPane.showMessageDialog(btn, "Your Full Name is : " + firstField.getText().trim() + " " + lastField.getText().trim());
                }
            }
        });

        panel.add(label);
        panel.add(FirstName);
        panel.add(firstField);
        panel.add(LastName);
        panel.add(lastField);
        panel.add(btn);

        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}
