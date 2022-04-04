package com.Geekbrains.Homework.HomeWorkApp7;

public class Demonstration {
    public static void main(String[] args) {
        Cat[] cats = new Cat[]{
                new Cat("Макс", 10),
                new Cat("Барсик", 5),
                new Cat("Мурзик", 15)
        };

        Plate plate = new Plate(20);

        for (Cat cat : cats) {
            cat.eat(plate);
            System.out.printf("Кот %s статус сытости %s %n", cat.getName(), cat.isSatiety());
        }
    }
}
