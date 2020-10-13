package com.company;

import javax.swing.*;
import java.awt.*;

public class TileGameMain extends Canvas {

    public static final int WIDTH = 360, HEIGHT = 240, SCALE = 2;

    public static void main(String[] args) {
        TileGameMain tileGameMain = new TileGameMain();
        tileGameMain.setPreferredSize(new Dimension(WIDTH * SCALE, HEIGHT * SCALE));
        tileGameMain.setMaximumSize(new Dimension(WIDTH * SCALE, HEIGHT * SCALE));
        tileGameMain.setMinimumSize(new Dimension(WIDTH * SCALE, HEIGHT * SCALE));

        JFrame frame = new JFrame("Tile RPG");
        frame.setSize(WIDTH * SCALE, HEIGHT * SCALE);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.add(tileGameMain);
        frame.setVisible(true);
        frame.pack();
    }
}
