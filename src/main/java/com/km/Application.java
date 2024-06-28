package com.km;

import com.km.ui.MainFrame;

import javax.swing.*;
import java.awt.*;

public class Application {
    public static void main(String[] args) {
        runFrame();
    }

    private static void runFrame() {
        MainFrame frame = new MainFrame();
        frame.createComponents();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setExtendedState(frame.getExtendedState());
        frame.setVisible(true);
        frame.setSize(new Dimension(800, 800));
    }
}
