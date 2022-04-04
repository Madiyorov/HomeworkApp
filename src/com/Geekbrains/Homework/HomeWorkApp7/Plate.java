package com.Geekbrains.Homework.HomeWorkApp7;

public class Plate {
    private int foodQuantity;

    public Plate(int foodQuantity) {
        this.foodQuantity = foodQuantity;
    }

    public void info() {
        System.out.println("Текущее кол-во еды " + foodQuantity);
    }

    public void decreaseFood(Cat cat, int foodQuantity) {
        this.foodQuantity -= foodQuantity;
    }

    public void addFood(int foodQuantity) {
        this.foodQuantity += foodQuantity;
    }

    public boolean isFoodEnough(int foodCount) {
        return this.foodQuantity >= foodCount;
    }
}
