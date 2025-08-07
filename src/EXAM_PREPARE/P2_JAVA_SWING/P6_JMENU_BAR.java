package EXAM_PREPARE.P2_JAVA_SWING;

import javax.swing.*;
import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class P6_JMENU_BAR {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JMenu Bar");
        frame.setSize(500, 599);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JMenuBar menu = new JMenuBar();
        JMenu File = new JMenu("File");
        JMenu Save_as = new JMenu("Save as");
        JMenu Options = new JMenu("Options");

        JMenuItem Open = new JMenuItem("Open");
        JMenuItem Edit = new JMenuItem("Edit");
        JMenuItem Close = new JMenuItem("Close");
        Close.setMnemonic(KeyEvent.VK_E);
        Close.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, InputEvent.ALT_DOWN_MASK));
        Close.setEnabled(false);
        ImageIcon ico = new ImageIcon("icon.ico");
        File.add(Open);
        File.add(Edit);
        File.add(Close);

        JToolBar tb = new JToolBar();
        tb.add(new JButton("Open from File"));
        tb.add(new JMenuItem("Open form Device"));
        frame.add(tb, BorderLayout.SOUTH);

        JButton btn = new JButton("About");
        btn.setToolTipText("Click to know about us!!");
        frame.add(btn, BorderLayout.NORTH);

        JMenuItem asPDF = new JMenuItem("Save as .PDF", ico);
        JMenuItem asDOC = new JMenuItem("Save as .DOC");
        JMenuItem asXCL = new JMenuItem("Save as .XCL");
        JCheckBoxMenuItem auto_save = new JCheckBoxMenuItem("AutoSave");
        JRadioButtonMenuItem Mute = new JRadioButtonMenuItem("Mute");
        JRadioButtonMenuItem Unmute = new JRadioButtonMenuItem("Unmute");
        ButtonGroup bg = new ButtonGroup();
        bg.add(Mute);
        bg.add(Unmute);
        Save_as.add(asPDF);
        Save_as.add(asDOC);
        Save_as.add(asXCL);
        Save_as.add(auto_save);
        Save_as.add(Mute);
        Save_as.add(Unmute);

        menu.add(File);
        menu.add(Save_as);
        menu.add(Options);

        JPopupMenu pop = new JPopupMenu();
        pop.add(new JMenuItem("Copy"));
        pop.add(new JMenuItem("Paste"));

        JTextArea area = new JTextArea();
        area.setComponentPopupMenu(pop);
        frame.add(area);

        frame.setJMenuBar(menu);
        frame.setVisible(true);
    }
}
