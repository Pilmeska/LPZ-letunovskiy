package org.example;

import java.util.Scanner;

        public class Main {
            public static final int SIZE = 5;
            public static final char EMPTY = '-';
            public static final char CROSS = 'X';
            public static final char ZERO = 'O';

            public static void main(String[] args) {
                char[][] field = new char[SIZE][SIZE];
                for (int i = 0; i < SIZE; i++) {
                    for (int j = 0; j < SIZE; j++) {
                        field[i][j] = EMPTY;
                    }
                }

                Scanner scanner = new Scanner(System.in);

                boolean isCrossTurn = true;

                while (true) {
                    printField(field);
                    System.out.println("Ходят " + (isCrossTurn ? "крестики" : "нолики") + "!");
                    String input = scanner.nextLine(); // "2 3"
                    String[] parts = input.split(" "); // ["2" , "3"]
                    int r = Integer.parseInt(parts[0]) - 1; // 2-1 = 1
                    int c = Integer.parseInt(parts[1]) - 1; // 3-1 = 2

                    if (field[r][c] != EMPTY) {
                        System.out.println("Сюда ходить нельзя");
                        continue;
                    }

                    field[r][c] = isCrossTurn ? CROSS : ZERO;
                    if (isWin(field, isCrossTurn ? CROSS : ZERO)) {
                        printField(field);
                        System.out.println("Победили " + (isCrossTurn ? "крестики" : "нолики"));
                        break;
                    } else {
                        if (isCrossTurn) {
                            isCrossTurn = false;
                        } else {
                            isCrossTurn = true;
                        }
                        //isCrossTurn = !isCrossTurn;
                    }
                }
                System.out.println("GAME OVER");
            }
            public static boolean isWin(char[][] field, char player) {
                if (field[0][0] == player && field[0][1] == player && field[0][2] == player && field[0][3] == player && field[0][4] == player)
                    return true;
                if (field[1][0] == player && field[1][1] == player && field[1][2] == player && field[1][3] == player && field[1][4] == player)
                    return true;
                if (field[2][0] == player && field[2][1] == player && field[2][2] == player&& field[2][3] == player && field[2][4] == player)
                    return true;
                if (field[3][0] == player && field[3][1] == player && field[3][2] == player&& field[3][3] == player && field[3][4] == player)
                    return true;
                if (field[4][0] == player && field[4][1] == player && field[4][2] == player&& field[4][3] == player && field[4][4] == player)
                    return true;

                if (field[0][0] == player && field[1][0] == player && field[2][0] == player && field[3][0] == player && field[4][0] == player)
                    return true;
                if (field[0][1] == player && field[1][1] == player && field[2][1] == player && field[3][1] == player && field[4][1] == player)
                    return true;
                if (field[0][2] == player && field[1][2] == player && field[2][2] == player && field[3][2] == player && field[4][2] == player)
                    return true;
                if (field[0][3] == player && field[1][3] == player && field[2][3] == player && field[3][3] == player && field[4][3] == player)
                    return true;
                if (field[0][4] == player && field[1][4] == player && field[2][4] == player && field[3][4] == player && field[4][4] == player)
                    return true;

                if (field[0][0] == player && field[1][1] == player && field[2][2] == player && field[3][3] == player && field[4][4] == player)
                    return true;
                if (field[4][0] == player && field[3][1] == player && field[2][2] == player&& field[1][3] == player && field[0][4] == player)
                    return true;
                for (int row = 0; row < SIZE; row++) {
                    if (field[row][0] == player && field[row][1] == player && field[row][2] == player && field[row][3] == player && field[row][4] == player)
                        return true;
                }
                return false;
            }
            public static void printField(char[][] field) {

                for (char[] row : field) {
                    for (char cell : row) {
                        System.out.print(cell + " ");
                    }
                    System.out.println();
                }
            }
        }
