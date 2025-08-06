package EXAM_PREPARE.JAVA_SWING;

import javax.swing.*;
import java.awt.*;

class myDialog extends JDialog{
        myDialog(JFrame parent){
            super(parent, "Custom Dialog", true);
            add(new JLabel("This is a Custom Dialog From Anup Chand"));
            setSize(500, 100);
        }
}
public class P3_CUSTOM_DIALOGS {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myDialog d1 = new myDialog(frame);
        d1.setVisible(true);
        frame.setVisible(true);
    }
}
