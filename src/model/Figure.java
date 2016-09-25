package model;

import java.util.Random;

public class Figure {
    private static Random rand = new Random();

    private static final char[][][] figure1 = {
            {
                    {' ', 'X'},
                    {' ', 'X'},
                    {'X', 'X'}
            },
            {
                    {'X', ' ', ' '},
                    {'X', 'X', 'X'}
            },
            {
                    {'X', 'X'},
                    {'X', ' '},
                    {'X', ' '}
            },
            {
                    {'X', 'X', 'X'},
                    {' ', ' ', 'X'},
            }
    };
    private static final char[][][] figure2 = {
            {
                    {'X', ' '},
                    {'X', ' '},
                    {'X', 'X'}
            },
            {
                    {'X', 'X', 'X'},
                    {'X', ' ', ' '}
            },
            {
                    {'X', 'X'},
                    {' ', 'X'},
                    {' ', 'X'}
            },
            {
                    {' ', ' ', 'X'},
                    {'X', 'X', 'X'},
            }
    };
    private static final char[][][] figure3 = {
            {
                    {'X'},
                    {'X'},
                    {'X'},
                    {'X'}
            },
            {
                    {'X', 'X', 'X', 'X'}
            }
    };
    private static final char[][][] figure4 = {
            {
                    {' ', 'X', 'X'},
                    {'X', 'X', ' '}
            },
            {
                    {'X', ' '},
                    {'X', 'X'},
                    {' ', 'X'}
            }
    };
    private static final char[][][] figure5 = {
            {
                    {'X', 'X', ' '},
                    {' ', 'X', 'X'}
            },
            {
                    {' ', 'X'},
                    {'X', 'X'},
                    {'X', ' '}
            }
    };
    private static final char[][][] figure6 = {
            {
                    {' ', 'X', ' '},
                    {'X', 'X', 'X'}
            },
            {
                    {'X', ' '},
                    {'X', 'X'},
                    {'X', ' '}
            },
            {
                    {'X', 'X', 'X'},
                    {' ', 'X', ' '}
            },
            {
                    {' ', 'X'},
                    {'X', 'X'},
                    {' ', 'X'}
            }
    };

    private static final char[][][] figure7 = {
            {
                    {'X', 'X'},
                    {'X', 'X'}
            }
    };

    private static final char[][][][] figures = {figure1, figure2, figure3, figure4, figure5, figure6, figure7};

    public static char[][][] getFigure1() {
        return figure1;
    }

    public static char[][][] getFigure7() {
        return figure7;
    }

    public static char[][][] getRandomStructureOfFigures() {
        int pos = rand.nextInt(figures.length);
        return figures[pos];
    }

    public static char[][] getNextFigure(char[][][] figure, int index) {
        if (index < 0) throw new IndexOutOfBoundsException();
        if (index < figure.length)
            return figure[index];
        else
            return figure[index % figure.length];
    }

    private static void printFigures(char[][][] figure) {
        for (int i = 0; i < figure.length; i++) {
            for (int j = 0; j < figure[i].length; j++) {
                for (int k = 0; k < figure[i][j].length; k++) {
                    System.out.print(figure[i][j][k]);
                }
                System.out.println();
            }
        }
    }

    public static void printFigure(char[][] figure) {
        for (int i = 0; i < figure.length; i++) {
            for (int j = 0; j < figure[i].length; j++) {
                System.out.print(figure[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static int getHightOfFigure(char[][] figure) {
        return figure.length;
    }

    public static int getWidthOfFigure(char[][] figure) {
        return figure[0].length;
    }

}
