

import javax.swing.*;

public class SwingDemo {
//    public static void main(String[] args) {
//        JFrame frame = new JFrame("Swing Demo");
//        JPanel panel = new JPanel();
//
//        JLabel label = new JLabel("Hello, Swing!");
//        JButton button = new JButton("Click me");
//
//        panel.add(label);
//        panel.add(button);
//
//        frame.add(panel);
//        frame.setSize(300, 200);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //close the window and also stop the execution of program in terminal
//        frame.setVisible(true);     //always right this code to male the GUI visible
//    }


    public static void main(String[] args) {
        JFrame frame = new JFrame("This is the Header you will see in the window beside minimize, maximize and close");
        JPanel panel = new JPanel();

        JLabel label  = new JLabel("This is the Label where you can keep what ever label you want");
        JButton button = new JButton("Hey It me a Buttoon");

        panel.add(label);
        panel.add(button);

        frame.add(panel);
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}
