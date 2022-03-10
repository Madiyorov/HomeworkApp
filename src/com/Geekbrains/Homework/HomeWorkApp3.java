package com.Geekbrains.Homework;

import java.util.Arrays;

public class HomeWorkApp3 {

    public static void main(String[] args) {
//        Задания №1
        int[] array = {1, 1, 1, 0, 0, 0, 1, 0, 1, 0};
        System.out.println(Arrays.toString(printApp1(array)));
//        Задания №2
        int[] arr = new int[100];
        System.out.println("before:" + Arrays.toString(arr));
        printApp2(arr, 1, 1);
        System.out.println("after: " + Arrays.toString(arr));
//        Задания №3
        int[] arrayNum = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        printApp3(arrayNum);
        System.out.println(Arrays.toString(arrayNum));
//        Задания №4
        printApp4(3);
//        Задания №5
        printApp5console(printApp5(19, 19));
//        Задания №6
        int[] minMaxArray = {1, 2, 3, 4, 5, 100, 120, 140, 6, 7, 8, 9, 10};
        System.out.println(printMin(minMaxArray));
        System.out.println(printMax(minMaxArray));
//        Задания №7
        int[] forCheckPrintApp7 = {0, 1, 2, 0, 1, 2};
        System.out.println(printApp7(forCheckPrintApp7));
//        Задания №8
        modifyArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, -2);
    }

    public static int[] printApp1(int[] array) {
        System.out.println("Задания №1");
        for (int i = 0; i < array.length; i++) {
            array[i] = (array[i] == 0) ? 1 : 0;
        }
        return array;
    }

    public static void printApp2(int[] array, int step, int shift) {
        System.out.println("Задания №2");
        for (int i = 0; i < 100; i++) {
            array[i] = shift + i * step;
        }
    }

    public static void printApp3(int[] array) {
        System.out.println("Задания №3");
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] *= 2;
            }
        }
    }

    public static void printApp4(int size) {
        System.out.println("Задания №4");
        int[][] sqrArray = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                sqrArray[i][j] = (i == j || j == (size - i - 1)) ? 1 : (int) (Math.random() * 100);
                System.out.printf("%4d", sqrArray[i][j]);
            }
            System.out.println();
        }
    }

    public static int[] printApp5(int len, int initialValue) {
        System.out.println("Задания №5");
        int[] arr = new int[len];
        Arrays.fill(arr, initialValue);
        return arr;
    }

    public static void printApp5console(int[] inputArray) {
        for (int j : inputArray) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public static int printMin(int[] array) {
        System.out.println("Задания №6");
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i])
                min = array[i];
        }
        return min;
    }

    public static int printMax(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i])
                max = array[i];
        }
        return max;
    }

    public static boolean printApp7(int[] array) {
        System.out.println("Задания №7");
        int leftSum = 0;
        for (int i = 0; i < array.length; i++) {
            leftSum += array[i];
            int rightSum = 0;
            for (int j = 0; j < array.length; j++) {
                rightSum += (j > i) ? array[j] : 0;
            }
            if (leftSum == rightSum) {
                return true;
            }
        }
        return false;
    }

    static void modifyArray(int[] arr, int n) {
        System.out.println("Задания №8");
        System.out.print("BEFORE: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        System.out.print("(n = " + n + ")");

        if (n > 0) {
            for (int i = 0; i < n; i++) {
                // Right
                int tmp = arr[arr.length - 1];
                for (int j = arr.length - 1; j > 0; j--) {
                    arr[j] = arr[j - 1];
                }
                arr[0] = tmp;
            }
        } else if (n < 0) {
            for (int i = 0; i < n * (-1); i++) {
                // Left
                int tmp = arr[0];
                for (int j = 0; j < arr.length - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                arr[arr.length - 1] = tmp;
            }
        }

        System.out.print("\nAFTER:  ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}

