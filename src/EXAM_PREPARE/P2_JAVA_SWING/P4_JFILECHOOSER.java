package EXAM_PREPARE.P2_JAVA_SWING;

import javax.swing.*;
import java.io.File;

public class P4_JFILECHOOSER {
    public static void main(String[] args) {
        JFrame frame = new JFrame("File Chooser From Java");
//        frame.setSize(500, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JFileChooser chooser = new JFileChooser();
        int result = chooser.showOpenDialog(null                                        );

        if(result == JFileChooser.APPROVE_OPTION){
            File selected = chooser.getSelectedFile();
            System.out.println("Selected From: " + selected.getAbsolutePath());
        }



        frame.setVisible(true);
    }
}
