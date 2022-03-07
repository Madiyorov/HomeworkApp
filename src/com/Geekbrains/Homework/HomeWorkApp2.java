package com.Geekbrains.Homework;

public class HomeWorkApp2 {
    public static void main(String[] args) {
        System.out.println(printWith(10,20));
        printPositiveOrNegative(-1);
        System.out.println(printNegative(-5));
        printWordNTimes(22);
        printYear(2022);
    }

    public static boolean printWith (int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
            return true;
        }else {
            return false;
        }
    }

    public static void printPositiveOrNegative(int x) {
        if (x >= 0 ) {
            System.out.println("Число " + x + "положительное");
        }else {
            System.out.println("Число " + x + " отрицательное");
        }
    }

    public static boolean printNegative(int a) {
        if (a < 0){
            return true;
        }else {
            return false;
        }
    }

    public static void printWordNTimes(int numberTime) {
        switch (numberTime) {
            case 1 -> System.out.println("Час ночи");
            case 2 -> System.out.println("Два часа ночи");
            case 3 -> System.out.println("Три часа ночи");
            case 4 -> System.out.println("Четыре часа утра");
            case 5 -> System.out.println("Пять часов утра");
            case 6 -> System.out.println("Шесть часов утра");
            case 7 -> System.out.println("Семь часов утра");
            case 8 -> System.out.println("Восемь часов утра");
            case 9 -> System.out.println("Девять часов утра");
            case 10 -> System.out.println("Десять часов утра");
            case 11 -> System.out.println("Одиннадцать часов утра");
            case 12 -> System.out.println("Полдень");
            case 13 -> System.out.println("Час дня");
            case 14 -> System.out.println("Два часа дня");
            case 15 -> System.out.println("Три часа дня");
            case 16 -> System.out.println("Четыре часа дня");
            case 17 -> System.out.println("Пять часов вечера");
            case 18 -> System.out.println("Шесть часов вечера");
            case 19 -> System.out.println("Семь часов вечера");
            case 20 -> System.out.println("Восемь часов вечера");
            case 21 -> System.out.println("Девять часов вечера");
            case 22 -> System.out.println("Десять часов вечера");
            case 23 -> System.out.println("Одиннадцать часов вечера");
            case 24 -> System.out.println("Полночь");
        }
    }

    public static void printYear(int year) {
        if (!(year % 4 == 0) || ((year % 100 == 0) && !(year % 400 == 0))) {
            System.out.println(year + " г. не високосный");
        }else {
            System.out.println(year + " г. високосный");
        }
    }
}
