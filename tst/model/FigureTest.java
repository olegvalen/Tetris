package model;

import org.junit.Test;

import static org.junit.Assert.*;

public class FigureTest {

    @Test
    public void getWidth() throws Exception {
        int expected = 2;
        int actual = Figure.getWidthOfFigure(Figure.getFigure1()[0]);
        assertEquals(expected, actual);
    }

    @Test
    public void getHight() throws Exception {
        int expected = 3;
        int actual = Figure.getHightOfFigure(Figure.getFigure1()[0]);
        assertEquals(expected, actual);
    }
}