package com.Geekbrains.Homework;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HomeWorkApp4 {

    private static final int SIZE = 5;
    private static final char DOT_X = 'X';
    private static final char DOT_0 = '0';
    private static final char DOT_EMPTY = '•';
    private static final int DOT_TO_WIN = 5;
    private static final char[][] MAP = new char[SIZE][SIZE];


    public static void main(String[] args) {
        initMap();
        printMap();

        while (true) {
            humanTurn();
            printMap();
            if (isWin(DOT_X)) {
                System.out.println("Человек победил");
                break;
            }
            if (isDraw())
                break;

            computerTurn();
            printMap();

            computerTurn();
            if (isWin(DOT_0)) {
                System.out.println("Победил компютерь");
                break;
            }
            if (isDraw())
                break;
        }
    }

    private static boolean isDraw() {
        if (isMapFull()) {
            System.out.println("Ничья");
            return true;
        }
        return false;
    }

    private static void humanTurn() {
        int x;
        int y;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Введите кординаты в формате X Y");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;

            if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) {
                System.out.println("Данные введены некорректно");
            } else if (MAP[x][y] != DOT_EMPTY) {
                System.out.println("Клетка уже занята");
            } else {
                break;
            }
        } while (true);

        MAP[x][y] = DOT_X;
    }

    private static boolean isWin(char symbol) {
        if (checkRowsAndColumns(symbol)) {
            return true;
        } else {
            return checkDiagonals(symbol);
        }
    }

    private static boolean checkDiagonals(char symbol) {
        int mainDiagonalCounter = 0;
        int sideDiagonalCounter = 0;
        for (int i = 0; i < SIZE; i++) {
            if (MAP[i][i] == symbol) {
                mainDiagonalCounter = mainDiagonalCounter + 1;
            }
            if (MAP[i][MAP.length - 1 - i] == symbol) {
                sideDiagonalCounter = sideDiagonalCounter + 1;
            }
            if (mainDiagonalCounter == DOT_TO_WIN || sideDiagonalCounter == DOT_TO_WIN) {
                return true;
            }
        }
        return false;
    }

    private static boolean checkRowsAndColumns(char symbol) {
        for (int i = 0; i < SIZE; i++) {
            int rowCounter = 0;
            int colCounter = 0;
            for (int j = 0; j < SIZE; j++) {
                if (MAP[i][j] == symbol) {
                    rowCounter = rowCounter + 1;
                } else {
                    rowCounter = 0;
                }
                if (MAP[j][i] == symbol) {
                    colCounter = colCounter + 1;
                } else {
                    colCounter = 0;
                }
                if (rowCounter == DOT_TO_WIN || colCounter == DOT_TO_WIN) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (MAP[i][i] == DOT_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

    private static void computerTurn() {
        int[] cell = getNextCellToWin(DOT_0);
        if (cell == null) {
            cell = getNextCellToWin(DOT_X);
            if (cell == null) {
                cell = getRandomEmptyCell();
            }
        }
        int x = cell[0];
        int y = cell[1];

        MAP[x][y] = DOT_0;
    }

    private static int[] getRandomEmptyCell() {
        int x;
        int y;
        Random random = new Random();

        do {
            x = random.nextInt(SIZE); // SIZE не включительно
            y = random.nextInt(SIZE);
        } while (MAP[x][y] != DOT_EMPTY);

        return new int[]{x, y};
    }

    private static int[] getNextCellToWin(char symbol) {
        for (int x = 0; x < SIZE; x++) {
            for (int y = 0; y < SIZE; y++) {
                if (MAP[x][y] == DOT_EMPTY && isGameMoveWinning(x, y, symbol)) {
                    return new int[]{x, y};
                }
            }
        }
        return null;
    }

    private static boolean isGameMoveWinning(int x, int y, char symbol) {
        MAP[x][y] = symbol;
        boolean result = isWin(symbol);
        MAP[x][y] = DOT_EMPTY;
        return result;
    }

    private static void initMap() {
        for (int i = 0; i < SIZE; i++) {
            Arrays.fill(MAP[i], DOT_EMPTY);
        }
    }

    private static void printMap() {
        printHeader();
        printBody();
    }

    private static void printHeader() {
        for (int i = 0; i <= SIZE; i++) {
            if (i == 0) {
                System.out.print("  ");
            } else {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    private static void printBody() {
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(MAP[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
