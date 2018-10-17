package com.sofiqul54.creatingwindows;

import javax.swing.JFrame;

public class Form_01 {

    static JFrame aWindow = new JFrame("This is the First Swing Practice");

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        int Width = 400;
        int Height = 150;
        aWindow.setBounds(450, 300, Width, Height);
        aWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aWindow.setVisible(true);

        
    }

}
