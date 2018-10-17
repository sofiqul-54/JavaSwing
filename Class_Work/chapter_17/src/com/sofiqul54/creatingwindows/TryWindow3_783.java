package com.sofiqul54.creatingwindows;


import java.awt.*;
import javax.swing.*;

public class TryWindow3_783 {
static JFrame aWindow = new JFrame("This is the window Title");

    public static void main(String[] args) {
        Point center = GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint();
        int windowWidth = 400;
        int windowHeight = 150;
        aWindow.setBounds(center.x-windowWidth/2, center.y-windowWidth/2, windowWidth, windowHeight);
        aWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aWindow.setVisible(true);
        
    }
}
