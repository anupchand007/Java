package JavaCore;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.io.File;

class MyDialog extends JDialog{
    MyDialog(JFrame parent){
        super(parent, "Custom Dialog", true);
        add(new JLabel("This is Anup Custom Dialog"));
        setSize(200, 100);
        setLocationRelativeTo(parent);
    }
}

public class AdvSwing {
    public static void main(String[] args) {
        JFrame frame = new JFrame("This is Adv Java Swing");
        frame.setSize(500, 500);;
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//        MyDialog dialog = new MyDialog(frame);
//        dialog.setVisible(true);

//        JFileChooser chooser = new JFileChooser();
//        int result = chooser.showOpenDialog(null);
//
//        if(result == JFileChooser.APPROVE_OPTION){
//            File selected = chooser.getSelectedFile();
//            System.out.println("Selected: " + selected.getAbsolutePath());
//        }
//        JDesktopPane desktop = new JDesktopPane();
//        JInternalFrame internal = new JInternalFrame("Internal Frame", true, true, true, true);
//        internal.setSize(200, 150);
//        internal.setVisible(true);
//        desktop.add(internal);
//
//        frame.add(desktop);

        JMenuBar menuBar = new JMenuBar();
        JMenu fileItem = new JMenu("File");
        JMenuItem openItem = new JMenu("Open");

        fileItem.add(openItem);
        menuBar.add(fileItem);
        frame.setJMenuBar(menuBar);


        JCheckBoxMenuItem chkItem = new JCheckBoxMenuItem("Show Line Numbers");
        JRadioButtonMenuItem darkMode = new JRadioButtonMenuItem("Dark Mode");
        fileItem.add(chkItem);
        fileItem.add(darkMode);

        JPopupMenu popup =new JPopupMenu();
        popup.add(new JMenuItem("Cut"));
        popup.add(new JMenuItem("Copy"));

        JTextArea area = new JTextArea();
        area.setComponentPopupMenu(popup);
        frame.add(area);

//
//        Color color = JColorChooser.showDialog(null, "Choose a Color", Color.BLUE);
//        System.out.println("Selected color: " + color );

        JToolBar toolBar  = new JToolBar();
        toolBar.add(new JButton("New"));
        toolBar.add(new JButton("Open"));
        frame.add(toolBar, BorderLayout.NORTH);

        JButton b = new JButton("Save");
        b.setToolTipText("Click to save your file");
        frame.add(b);


        frame.setVisible(true);
    }
}
