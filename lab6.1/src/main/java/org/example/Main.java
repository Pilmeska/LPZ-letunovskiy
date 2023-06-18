package org.example;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int SIZE = 8;
        int[][] colors = new int[SIZE][SIZE];
        int[][] rotatedColors = new int[SIZE][SIZE];
        Random random = new Random();
        	  for (int i = 0; i< SIZE; i++) {
            	    for (int j = 0; j< SIZE; j++) {
                	      colors[i][j] = random.nextInt(256);
                	    }
        }
        Random randomm = new Random();
        for (int i = 0; i< SIZE; i++) {
            for (int j = 0; j< SIZE; j++) {
                rotatedColors[i][j] = colors[colors.length - j - 1][i];
            }
        }
        System.out.println("Дана следующая матрица: ");
        for (int i = 0; i< SIZE; i++) {
            	    for (int j = 0; j< SIZE; j++) {
                	      System.out.format("%4d", colors[i][j]);
                	    }
            	    System.out.println();
        }
        System.out.println("Результат перевернутой на 90 градусов матрицы: ");
        for (int i = 0; i< SIZE; i++) {
            for (int j = 0; j< SIZE; j++) {
                System.out.format("%4d", rotatedColors[i][j]);
            }
            System.out.println();
        }


    }
}