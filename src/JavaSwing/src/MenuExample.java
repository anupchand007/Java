import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuExample {

    public static void main(String[] args) {
        createFrame();
    }

    public static void createFrame() {
        JFrame frame = new JFrame("Menu Bar");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create the menu bar
        JMenuBar menuBar = new JMenuBar();

        // Create menus
        JMenu fileMenu = new JMenu("File");
        JMenu editMenu = new JMenu("Edit");
        JMenu Save_as = new JMenu("Save As");


        // Create menu items
        JMenuItem newItem = new JMenuItem("New");

        newItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                createFrame();
            }
        });


        JMenuItem openItem = new JMenuItem("Open");
        JMenuItem exitItem = new JMenuItem("Exit");

        JMenuItem view = new JMenuItem("View");
        JMenuItem setting = new JMenuItem("Setting");
        JMenuItem preferences = new JMenuItem("Preferences");

        JMenuItem saveaspdf = new JMenuItem("Save as PDF");
        JMenuItem saveasdoc = new JMenuItem("Save as DOC");
        JMenuItem saveasxml = new JMenuItem("Save as XML");

        // Add menu items to the File menu
        fileMenu.add(newItem);
        fileMenu.add(openItem);
        fileMenu.add(Save_as);
        fileMenu.add(exitItem);

        editMenu.add(view);
        editMenu.add(setting);
        editMenu.add(preferences);

        Save_as.add(saveaspdf);
        Save_as.add(saveasdoc);
        Save_as.add(saveasxml);

        // Add menus to the menu bar
        menuBar.add(fileMenu);
        menuBar.add(editMenu);




        // Set the menu bar to the frame
        frame.setJMenuBar(menuBar);

        frame.setVisible(true);
    }
}
