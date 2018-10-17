package com.sofiqul54.common;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

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
        JMenu file = new JMenu("File");
        jMenuBar.add(file);

        JMenu help = new JMenu("help");
        jMenuBar.add(help);

        jMenuBar.add(new JMenu("About"));
        /////////////////////////////////////////////////////////////////       
        JMenuItem item1 = new JMenuItem("New");
        JMenuItem item2 = new JMenuItem("Open");
        JMenuItem item3 = new JMenuItem("Exit");
        file.add(item1);
        file.add(item2);
        file.add(item3);
        item1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                new Test1().setVisible(true);
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
    }
}
