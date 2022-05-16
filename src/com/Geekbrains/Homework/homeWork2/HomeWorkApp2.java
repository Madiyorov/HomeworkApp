package com.Geekbrains.Homework.homeWork2;

public class HomeWorkApp2 {
    public static void main(String[] args) {
        System.out.println(printWith(10, 20));
        printPositiveOrNegative(-1);
        System.out.println(printNegative(-5));
        printWord(5);
        printYear(2022);
    }

    public static boolean printWith(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    public static void printPositiveOrNegative(int x) {
        if (x >= 0) {
            System.out.println("Число " + x + "положительное");
        } else {
            System.out.println("Число " + x + " отрицательное");
        }
    }

    public static boolean printNegative(int a) {
        return a < 5;
    }

    public static void printWord(int numberWorld) {
        for (int i = 0; i < numberWorld; i++) {
            System.out.println("Hello,World!");
        }
    }

    public static void printYear(int year) {
        if (!(year % 4 == 0) || ((year % 100 == 0) && !(year % 400 == 0))) {
            System.out.println(year + " г. не високосный");
        } else {
            System.out.println(year + " г. високосный");
        }
    }
}
