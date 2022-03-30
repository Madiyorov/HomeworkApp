package com.Geekbrains.Homework.HomeWorkApp6;

class Cat extends Animal {
    Cat(int run_limit, float jump_limit, int swim_limit) {
        super(run_limit, jump_limit, swim_limit);
    }

    @Override
    protected boolean swim() {
        return false;
    }
}
