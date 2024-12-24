package com.cmart.retrotennis.util;

import com.cmart.retrotennis.util.Time;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ComponentEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.ComponentAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.*;


public class Window {
    private static BufferedImage image;
    private static int[] buffer;

    private static BufferedImage paletteImage;
    private static int[] palette;

    private static JFrame frame;
    private static Canvas canvas;
    private static BufferStrategy BufferStrategy;

    public static int width, height;

    public static boolean focused;

    public static int frames, tick, fps, tps;
    public static long lastSecond, lastFrame, frameTime, tickTimeRemaining;

    public static boolean close;

    public static void init(String title, int width, int height) {
        Window.width = width;
        Window.height = height;

        Window.lastSecond = Time.now();
        Window.lastFrame = Time.now();

        GraphicsConfiguration graphicsConfiguration = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice().getDefaultConfiguration();
        Window.image = graphicsConfiguration.createCompatibleImage(com.cmart.retrotennis.gfx.Renderer.WIDTH, com.cmart.retrotennis.gfx.Renderer.HEIGHT);



    }






}
