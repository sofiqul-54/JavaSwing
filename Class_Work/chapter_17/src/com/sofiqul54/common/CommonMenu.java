package com.sofiqul54.common;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

public class CommonMenu {

    /*
    public static void main(String[] args) {
        JFrame f = new JFrame("Common Menu");
        
        /*JMenuBar jMenuBar = new JMenuBar();
        JMenu file = new JMenu("File");
        jMenuBar.add(file);

        JMenu help = new JMenu("help");
        jMenuBar.add(help);
        /////////////////////////////////////////////////////////////////       
        JMenuItem item1 = new JMenuItem("New");
        JMenuItem item2 = new JMenuItem("Open");
        JMenuItem item3 = new JMenuItem("Exit");
        file.add(item1);
        file.add(item2);
        file.add(item3);

        
        /// file.add(new JMenuItem("New"));
      ///  file.add(new JMenuItem("Open"));
        ////file.add(new JMenuItem("Exit"));
         
        /////////////////////////////////////////////////////////////      
        f.setJMenuBar(jMenuBar);
        --------------
        f.setBounds(10, 20, 400, 250);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
     */
    public static void getCommonMenu(JFrame f) {

        JMenuBar jMenuBar = new JMenuBar();
        JMenu file = new JMenu("File"); // add menu Step - 1
        jMenuBar.add(file);

        JMenu help = new JMenu("help");
        jMenuBar.add(help);

        jMenuBar.add(new JMenu("About"));//add menu step - 2 (ai vabeo menu add kora jay menu bare.)
        /////////////////////////////////////////////////////////////////       
        JMenuItem item1 = new JMenuItem("New");// menu bare submenu/item add kora
        JMenuItem item2 = new JMenuItem("Open");// menu bare submenu/item add kora
        Object obj = new Object();
        item2.setIcon(new javax.swing.ImageIcon(obj.getClass().getResource("/com/sofiqul54/common/bd.png")));
        
        item2.setMnemonic('O'); // memu shortcut create
        item2.setAccelerator(KeyStroke.getKeyStroke('O', InputEvent.CTRL_DOWN_MASK));
        file.add(item2);
        item2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              f.setVisible(false);
              new New().setVisible(true);
            }
        });
        JMenuItem item3 = new JMenuItem("Exit");
        file.add(item1);
        file.add(item2);
        file.add(item3);
        item1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(true);
                new New().setVisible(true);
            }
        });
        JMenuItem item4 = new JMenuItem("New");
        help.add(item4);
        help.add(item1);
        /*
        file.add(new JMenuItem("New"));
        file.add(new JMenuItem("Open"));
        file.add(new JMenuItem("Exit"));
         */
        /////////////////////////////////////////////////////////////      
        f.setJMenuBar(jMenuBar);
        f.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
}
