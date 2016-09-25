package view;

import controllers.ResetRowController;
import controllers.WinnerController;
import model.Field;
import model.Figure;
import model.Game;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ConsoleView {

    private final WinnerController winnerController = new WinnerController();
    private final ResetRowController resetRowController = new ResetRowController();

    public void show(final Game game) {

        Field field = game.getGameField();
        char[][] f = field.getField();
        int width = field.getWIDTH();
        int hight = field.getHIGHT();

        printRowOfNumbers(width);

        for (int i = 0; i < hight; i++) {
            for (int j = 0; j < width; j++) {
                if (f[i][j] != 'X')
                    f[i][j] = ' ';
            }
        }

        for (int i = 0; i < hight; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(f[i][j]);
            }
            System.out.println();
        }

        printRowOfNumbers(width);

    }

    public boolean move(final Game game) {
        final Field field = game.getGameField();
        final boolean win = winnerController.checkWin(game);
        if (win) {
            System.out.println("You win!");
            return false;
        }
        char[][][] structure = Figure.getRandomStructureOfFigures();
        char[][] currentFigure = Figure.getNextFigure(structure, 0);
        currentFigure = getFigure(game, structure, currentFigure, 0);
        char[][] figure = field.getGotFigure();
        int x = getColumn();
        field.setFigure(figure, x, 0);

        resetRowController.checkReset(field);

        return true;
    }

    private int getColumn() {

        System.out.println("Please enter a number of a column:");
        Scanner in = new Scanner(System.in);
        int column = 0;
        try {
            column = in.nextInt();
        } catch (InputMismatchException e) {
            getColumn();
        }
        if (column < 1)
            getColumn();

        return column - 1;
    }

    private char[][] getFigure(Game game, char[][][] structure, char[][] figure, int index) {

        Figure.printFigure(figure);

        System.out.println("Please enter 's' - to set a figure, 'r' - to rotate it, 'e' - to exit:");

        Scanner in = new Scanner(System.in);
        char c = 'a';
        try {
            c = in.nextLine().charAt(0);
        } catch (InputMismatchException e) {
            getFigure(game, structure, figure, index);
        }

        if (c == 'r') {
            index++;
            figure = Figure.getNextFigure(structure, index);
            getFigure(game, structure, figure, index);
        } else if (c == 's') {
            game.getGameField().setGotFigure(figure);
            return figure;
        } else if (c == 'e') {
            System.exit(0);
        } else
            getFigure(game, structure, figure, index);
        return figure;
    }

    private void printRowOfNumbers(int width) {
        for (int i = 1; i <= width; i++) {
            int j = i;
            if (j < 10) j = i;
            else j = i % 10;
            System.out.print(j);
        }
        System.out.println();

        for (int i = 0; i < width; i++) {
            System.out.print("-");
        }
        System.out.println();

    }

}
