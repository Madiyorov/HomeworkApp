package com.Geekbrains.Homework.homeWork6;

class Cat extends Animal {
    Cat(int runLimit, float jumpLimit, int swimLimit) {
        super(runLimit, jumpLimit, swimLimit);
    }

    @Override
    protected boolean swim() {
        return false;
    }
}
