package com.Geekbrains.Homework.homeWork6;

abstract public class Animal {
    public final int runLimit;
    public final float jumpLimit;
    public final int swimLimit;

    Animal(int runLimit, float jumpLimit, int swimLimit) {
        this.runLimit = runLimit;
        this.jumpLimit = jumpLimit;
        this.swimLimit = swimLimit;
    }

    protected boolean run() {
        return 200 <= runLimit;
    }

    protected boolean jump() {
        return (float) 1.5 <= jumpLimit;
    }

    protected boolean swim() {
        return 5 <= swimLimit;
    }
}
