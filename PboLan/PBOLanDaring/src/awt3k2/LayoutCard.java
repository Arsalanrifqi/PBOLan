package awt3k2;

import java.awt.*;
import javax.swing.*;

public class LayoutCard {
	
	final static String NIMPANEL = "NIM";
    final static String NAMAPANEL = "NAMA";
    final static String JKPANEL = "JENIS KELAMIN";
    final static String TGLLAHIRPANEL = "TGL LAHIR";
    final static String TMPLAHIRPANEL = "TMP LAHIR";
    final static String ALAMATPANEL = "ALAMAT";
    final static String SAVEPANEL = "SAVE";
    final static int extraWindowWidth = 100;
 
    public void addComponentToPane(Container pane) {
        JTabbedPane tabbedPane = new JTabbedPane();
 
        //Create the "cards".
        JPanel save = new JPanel() {
            //Make the panel wider than it really needs, so
            //the window's wide enough for the tabs to stay
            //in one row.
            public Dimension getPreferredSize() {
                Dimension size = super.getPreferredSize();
                size.width += extraWindowWidth;
                return size;
            }
        };
        save.add(new JButton("SAVE"));
        
        JPanel JK = new JPanel() {
            //Make the panel wider than it really needs, so
            //the window's wide enough for the tabs to stay
            //in one row.
            public Dimension getPreferredSize() {
                Dimension size = super.getPreferredSize();
                size.width += extraWindowWidth;
                return size;
            }
        };
        JK.add(new JButton("LAKI LAKI"));
        JK.add(new JButton("PEREMPUAN"));
 
        JPanel text1 = new JPanel();
        text1.add(new JTextField("", 20));
        JPanel text2 = new JPanel();
        text2.add(new JTextField("", 20));
        JPanel text3 = new JPanel();
        text3.add(new JTextField("", 20));
        JPanel text4 = new JPanel();
        text4.add(new JTextField("", 20));
        JPanel text5 = new JPanel();
        text5.add(new JTextField("", 20));
        JPanel text6 = new JPanel();
        text6.add(new JTextField("", 20));
 
        tabbedPane.addTab(NIMPANEL, text1);
        tabbedPane.addTab(NAMAPANEL, text2);
        tabbedPane.addTab(JKPANEL, JK);
        tabbedPane.addTab(TGLLAHIRPANEL, text3);
        tabbedPane.addTab(TMPLAHIRPANEL, text4);
        tabbedPane.addTab(TMPLAHIRPANEL, text5);
        tabbedPane.addTab(ALAMATPANEL, text6);
        tabbedPane.addTab(SAVEPANEL, save);
        
 
        pane.add(tabbedPane, BorderLayout.CENTER);
    }
 
    /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event dispatch thread.
     */
    private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("TabDemo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        //Create and set up the content pane.
        LayoutCard demo = new LayoutCard();
        demo.addComponentToPane(frame.getContentPane());
 
        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }
 
    public static void main(String[] args) {
        /* Use an appropriate Look and Feel */
        try {
            //UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
        } catch (UnsupportedLookAndFeelException ex) {
            ex.printStackTrace();
        } catch (IllegalAccessException ex) {
            ex.printStackTrace();
        } catch (InstantiationException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        /* Turn off metal's use of bold fonts */
        UIManager.put("swing.boldMetal", Boolean.FALSE);
         
        //Schedule a job for the event dispatch thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
