package controllers;

import model.Game;

public class WinnerController {

    public boolean checkWin(Game game) {
        if (game.count == Game.AMOUNT_OF_STEPS_TO_WIN)
            return true;
        game.count++;
        return false;
    }
}
