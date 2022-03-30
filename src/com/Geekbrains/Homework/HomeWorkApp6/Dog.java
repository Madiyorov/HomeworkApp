package com.Geekbrains.Homework.HomeWorkApp6;

class Dog extends Animal {
    Dog(int run_limit, float jump_limit, int swim_limit) {
        super(run_limit, jump_limit, swim_limit);
    }

    @Override
    protected boolean swim() {
        return true;
    }
}
