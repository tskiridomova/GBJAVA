package com.example;

import java.util.Arrays;

public class Lesson3 {
    public static void main(String[] args) {
        replaceArray();
        createArray();
        multyplyArray();
        createGrid();
        System.out.println(Arrays.toString(fillArray(10, 2)));
    }

    // 1. Задать целочисленный массив, состоящий из элементов 0 и 1.
    // Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
    // С помощью цикла и условия заменить 0 на 1, 1 на 0;
    public static void replaceArray() {
        int[] numbers = new int[]{1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println("До изменений: " + Arrays.toString(numbers));
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 1) {
                numbers[i] = 0;
            } else if (numbers[i] == 0) {
                numbers[i] = 1;
            }
        }
        System.out.println("После изменений: " + Arrays.toString(numbers));
    }

    // 2. Задать пустой целочисленный массив длиной 100.
    // С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
    public static void createArray() {
        int[] numbers = new int[100];
        for (int i = 0; i < 100; i++) {
            numbers[i] = i + 1;
        }
        System.out.println(Arrays.toString(numbers));
    }

    // 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
    // пройти по нему циклом, и числа меньшие 6 умножить на 2;
    public static void multyplyArray() {
        int[] numbers = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("До изменений: " + Arrays.toString(numbers));
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 6) {
                numbers[i] = numbers[i] * 2;
            }
        }
        System.out.println("После изменений: " + Arrays.toString(numbers));
    }

    // 4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
    // и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей,
    // если обе сложно). Определить элементы одной из диагоналей можно по следующему принципу:
    // индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
    public static void createGrid() {
        int max = 9;
        int[][] grid = new int[max][max];
        for (int i = 0; i < max; i++) {
            for (int j = 0; j < max; j++) {
                grid[i][j] = 0;
                if (i == j) {
                    grid[i][j] = 1;
                }
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }

    // 5. Написать метод, принимающий на вход два аргумента: len и initialValue,
// и возвращающий одномерный массив типа int длиной len,
// каждая ячейка которого равна initialValue;
    public static int[] fillArray(int len, int initialValue) {
        int[] numbers = new int[len];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = initialValue;
        }
        return numbers;
    }

}

