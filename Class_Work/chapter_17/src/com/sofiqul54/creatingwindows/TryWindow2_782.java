package com.sofiqul54.creatingwindows;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

public class TryWindow2_782 {

    static JFrame aWindow = new JFrame("This is The Window Title");

    public static void main(String[] args) {
        Toolkit theKit = aWindow.getToolkit();
        Dimension WndSize = theKit.getScreenSize();

        aWindow.setBounds(WndSize.width / 4, WndSize.height / 4, WndSize.width / 2,
                WndSize.height / 2);
        aWindow.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        aWindow.setVisible(true);
    }
}
