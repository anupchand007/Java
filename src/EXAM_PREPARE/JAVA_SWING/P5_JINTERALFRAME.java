package EXAM_PREPARE.JAVA_SWING;

import javax.swing.*;

public class P5_JINTERALFRAME {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(1000, 1000);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JDesktopPane pane =  new JDesktopPane();

        JInternalFrame internal = new JInternalFrame("Internal Frame", true,true, true, true);
        internal.setSize(500, 500);
        internal.setVisible(true);

        pane.add(internal);

        frame.add(pane);
        frame.setVisible(true);


    }
}
