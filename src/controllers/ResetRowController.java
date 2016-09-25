package controllers;

import model.Field;

import java.awt.Point;

public class ResetRowController {
    public void checkReset(Field field) {
        int y = field.getHIGHT() - 1;
        int width = field.getWIDTH();

        while (y >= 0) {
            boolean ableToReset = true;
            first:
            {
                for (int x = 0; x < width; x++) {
                    if (field.getSell(new Point(x, y)) != 'X') {
                        ableToReset = false;
                        y--;
                        break first;
                    }
                }
            }

            if (ableToReset) {
                for (int y2 = y; y2 >= 1; y2--) {
                    for (int x2 = 0; x2 < width; x2++) {
                        field.setSell(new Point(x2, y2), field.getSell(new Point(x2, y2 - 1)));
                    }
                }
            }
        }
    }
}
