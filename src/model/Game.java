package model;

public class Game {
    public static final int AMOUNT_OF_STEPS_TO_WIN = 100;
    public int count = 0;
    private final Field gameField;

    public Game(Field field) {
        this.gameField = field;
    }

    public Field getGameField() {
        return gameField;
    }
}
