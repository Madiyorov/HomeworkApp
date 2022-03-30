package com.Geekbrains.Homework.HomeWorkApp6;

abstract public class Animal {
    private final int run_limit;
    private final float jump_limit;
    private final int swim_limit;

    Animal(int run_limit, float jump_limit, int swim_limit) {
        this.run_limit = run_limit;
        this.jump_limit = jump_limit;
        this.swim_limit = swim_limit;
    }

    protected boolean run() {
        return 200 <= run_limit;
    }

    protected boolean jump() {
        return (float) 1.5 <= jump_limit;
    }

    protected boolean swim() {
        return 5 <= swim_limit;
    }
}
