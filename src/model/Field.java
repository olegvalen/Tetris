package model;

import java.awt.Point;

public class Field {
    private static final int WIDTH = 20;
    private static final int HIGHT = 12;
    private final char[][] field;
    public Point previousPoint;
    private char[][] gotFigure;

    public Field() {
        field = new char[HIGHT][WIDTH];
    }

    public void setSell(Point point, char value) {
        field[point.y][point.x] = value;
    }

    public char getSell(Point point) {
        return field[point.y][point.x];
    }

    public char[][] getField() {
        return field;
    }

    public int getWIDTH() {
        return WIDTH;
    }

    public int getHIGHT() {
        return HIGHT;
    }

    public char[][] getGotFigure() {
        return gotFigure;
    }

    public void setGotFigure(char[][] gotFigure) {
        this.gotFigure = gotFigure;
    }

    public void setFigure(char[][] figure, Point point) {
        int width = Figure.getWidthOfFigure(figure);
        int height = Figure.getHightOfFigure(figure);

        if (width + point.x > WIDTH)
            point.x = WIDTH - width;

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                Point checkPoint = new Point(point.x + x, point.y + y);
                if (getSell(checkPoint) == ' ' & figure[y][x] == 'X')
                    setSell(checkPoint, figure[y][x]);
            }
        }
    }

    public void setFigure(char[][] figure, int pointX, int pointY) {
        int width = Figure.getWidthOfFigure(figure);
        int height = Figure.getHightOfFigure(figure);

        if (width + pointX > WIDTH)
            pointX = WIDTH - width;

        boolean successful = true;
        first:
        {
            for (int y = 0; y < height; y++) {
                for (int x = 0; x < width; x++) {
                    if (pointY + y > HIGHT - 1 ||
                            (getSell(new Point(pointX + x, pointY + y)) == 'X' &&
                                    figure[y][x] == 'X')) {
                        successful = false;
                        break first;
                    }
                }
            }
        }

        if (successful) {
            previousPoint = new Point(pointX, pointY);
            pointY++;
            setFigure(figure, pointX, pointY);
        } else {
            if (previousPoint == null) {
                System.out.println("You lose!");
                System.exit(0);
            } else {
                setFigure(figure, new Point(previousPoint.x, previousPoint.y));
                previousPoint = null;
            }
        }
    }
}
