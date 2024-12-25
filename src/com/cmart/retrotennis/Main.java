package com.cmart.retrotennis;

import com.cmart.retrotennis.util.*;
import com.cmart.retrotennis.util.Window;
import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.FileSystemNotFoundException;
import java.nio.file.Paths;
import java.nio.file.spi.FileSystemProvider;
import java.util.Map;
import java.util.Optional;



import java.awt.*;

public class Main implements Runnable {
    public static void main(String[] args) {
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        Window.init("microtennis", screen.width / 2, screen.height / 2);
        new Thread(new Main()).start();
    }

    @Override
    public void run() {
        try {
            Window.loop(
                    this::init,
                    this::destroy,
                    this::tick,
                    this::update,
                    this::render
            );
        } catch(Exception e) {
            e.printStackTrace();
            System.exit(1);
        }
    }
    private void init() {

    }
    private void destroy() {

    }
    private void tick() {
        Global.ticks++;
        Keyboard.tick();
    }
    private void update() {
        Keyboard.update();
        Global.currentState.update();
    }
    private void render() {
        Global.frames++;
        Renderer.clear();
        Global.currentState.render();
    }
}