package com.cmart.retrotennis.gfx;

import com.cmart.retrotennis.util.AABB;

import java.util.*;

public class Renderer {

   public static final int[] DITHER = new int[]{0, 8, 2, 10, 12, 4, 14, 6, 3, 11, 1, 9, 15, 7, 13, 5};
   public static final int WIDTH = 256, HEIGHT = 144;

   public static int[] pixels = new int[WIDTH * HEIGHT];

   public static int[] generatePalette() {
      int[] result = new int[256];
      int i = 0;
      for (int r = 0; r < 6; r++) {
         for (int g = 0; g < 6; g++) {
            for (int b = 0; b < 6; b++) {
               int rr = (r * 255) / 5,
                       gg = (g * 255) / 5,
                       bb = (b * 255) / 5,
                       m = (rr * 30 * gg * 59 + bb * 11) / 100;
               result[i++] = ((((rr + m) / 2) * 230 / 255 + 10) << 16) |
                       ((((gg + m) / 2) * 230 / 255 + 10) << 8) |
                       ((((bb + m) / 2) * 230 / 255 + 10) << 0);
            }
         }
      }
      return result;
   }
}
