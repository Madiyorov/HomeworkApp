package com.Geekbrains.Homework.homeWork6;

class Dog extends Animal {
    Dog(int runLimit, float jumpLimit, int swimLimit) {
        super(runLimit, jumpLimit, swimLimit);
    }

    @Override
    protected boolean swim() {
        return true;
    }
}
