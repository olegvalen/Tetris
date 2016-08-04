package model;

import java.util.Arrays;

import static model.Figure.print;

public class Figure {
    private static final char[][][] figure1 = {
            {
                    {' ', 'X'},
                    {' ', 'X'},
                    {' ', 'X'},
                    {'X', 'X'}
            },
            {
                    {'X', ' ', ' ', ' '},
                    {'X', 'X', 'X', 'X'}
            },
            {
                    {'X', 'X'},
                    {'X', ' '},
                    {'X', ' '},
                    {'X', ' '}
            },
            {
                    {'X', 'X', 'X', 'X'},
                    {' ', ' ', ' ', 'X'},
            }
    };
    private static final char[][][] figure2 = {
            {
                    {'X', ' '},
                    {'X', ' '},
                    {'X', ' '},
                    {'X', 'X'}
            },
            {
                    {'X', 'X', 'X', 'X'},
                    {'X', ' ', ' ', ' '}
            },
            {
                    {'X', 'X'},
                    {' ', 'X'},
                    {' ', 'X'},
                    {' ', 'X'}
            },
            {
                    {' ', ' ', ' ', 'X'},
                    {'X', 'X', 'X', 'X'},
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
                    {'X', 'X', 'X'}
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

    public static void main(String[] args) {
        print(figure6);

    }

    public static void print(char[][][] figure) {
        for (int i = 0; i < figure.length; i++) {
            for (int j = 0; j < figure[i].length; j++) {
                for (int k = 0; k < figure[i][j].length; k++) {
                    System.out.print(figure[i][j][k]);
                }
                System.out.println();
            }
        }
    }
}




