package model;

import org.junit.Test;

import java.awt.*;

import static org.junit.Assert.*;

public class FieldTest {

    @Test
    public void setSell() throws Exception {
        Field field = new Field();
        field.setSell(new Point(0, 0), 'X');
        char expected = 'X';
        char actual = field.getField()[0][0];
        assertEquals(expected, actual);
    }

    @Test
    public void getSell() throws Exception {
        Field field = new Field();
        field.setSell(new Point(0, 0), 'X');
        char expected = 'X';
        char actual = field.getSell(new Point(0, 0));
        assertEquals(expected, actual);
    }
}