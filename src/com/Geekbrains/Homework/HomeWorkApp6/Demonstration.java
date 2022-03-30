package com.Geekbrains.Homework.HomeWorkApp6;

public class Demonstration {
    public static void main(String[] args) {
        Animal[] animal = {new Cat(200, 2, 0), new Dog(500, 0.5f, 10)};
        for (Animal an : animal) {
            System.out.println(
                    an.getClass().getName() +
                            "\nrun: " + an.run() +
                            "\njump: " + an.jump() +
                            "\nswim: " + an.swim());
        }
    }
}
