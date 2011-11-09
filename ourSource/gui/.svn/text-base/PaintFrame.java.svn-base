import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Component;

public class PaintFrame extends JFrame {
    public static void main(String[] args) {
        PaintFrame frame = new PaintFrame("Paint++");
        frame.setSize(600, 400);
        frame.setMinimumSize(new Dimension(300, 300));
        frame.setVisible(true);
    }
    
    public PaintFrame(String title) {
        super(title);
        
        this.setLayout(new BorderLayout());
        this.setJMenuBar(menuBar());

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

    }
    
    private JMenuBar menuBar() {
        JMenuBar menuBar = new JMenuBar();

        menuBar.add(fileMenu());
        menuBar.add(editMenu());
        menuBar.add(helpMenu());

        return menuBar;
    }

    private JMenu fileMenu() {
        JMenu fileMenu = new JMenu("File");

        JMenuItem open = new JMenuItem("Open");
        JMenuItem save = new JMenuItem("Save");
        JMenuItem exit = new JMenuItem("Exit");

        fileMenu.setMnemonic('F');
        open.setMnemonic('O');
        save.setMnemonic('S');
        exit.setMnemonic('X');

        fileMenu.add(open);
        fileMenu.add(save);
        fileMenu.add(exit);

        open.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFileChooser chooser = new JFileChooser();
                FileNameExtensionFilter filter = new FileNameExtensionFilter(
                    "Paint++ Images", "ppp");
                chooser.setFileFilter(filter);
                int returnVal = chooser.showOpenDialog(PaintFrame.this);
                if(returnVal == JFileChooser.APPROVE_OPTION) {
                    // Call method on the DrawPanel to load the state
                    // of the drawing.
                }
            }
        });
        
        save.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFileChooser chooser = new JFileChooser();
                FileNameExtensionFilter filter = new FileNameExtensionFilter(
                    "Paint++ Images", "ppp");
                chooser.setFileFilter(filter);
                int returnVal = chooser.showSaveDialog(PaintFrame.this);
                if(returnVal == JFileChooser.APPROVE_OPTION) {
                    // Call method on the DrawPanel to save the state
                    // of the drawing.
                }
            }
        });

        exit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        return fileMenu;
    }

    private JMenu editMenu() {
        JMenu editMenu = new JMenu("Edit");

        JMenuItem undo = new JMenuItem("Undo");
        JMenuItem redo = new JMenuItem("Redo");
        JMenuItem clear = new JMenuItem("Clear");

        editMenu.setMnemonic('E');
        undo.setMnemonic('U');
        redo.setMnemonic('R');
        clear.setMnemonic('C');

        editMenu.add(undo);
        editMenu.add(redo);
        editMenu.add(clear);

        return editMenu;
    }

    private JMenu helpMenu() {
        JMenu helpMenu = new JMenu("Help");

        JMenuItem about = new JMenuItem("About");

        helpMenu.setMnemonic('H');
        about.setMnemonic('A');

        helpMenu.add(about);

        return helpMenu;
    }
}
