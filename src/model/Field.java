package model;

public class Field {

    private static final int MIN_WIDTH = 4;
    private static final int MIN_HIGH = 10;
    private final int MAX_WIDTH;
    private final int MAX_HIGH;

    public Field(int MAX_WIDTH, int MAX_HIGH) {
        this.MAX_WIDTH = MAX_WIDTH;
        this.MAX_HIGH = MAX_HIGH;
    }


}
