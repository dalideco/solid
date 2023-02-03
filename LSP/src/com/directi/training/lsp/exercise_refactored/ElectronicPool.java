package com.directi.training.lsp.exercise_refactored;

import com.directi.training.lsp.exercise.Duck;
import com.directi.training.lsp.exercise.ElectronicDuck;
import com.directi.training.lsp.exercise.Pool;

public class ElectronicPool {
    public void run() {
        ElectronicDuck electricDuck = new ElectronicDuck();
        electricDuck.turnOn();

        quack(electricDuck);
        swim(electricDuck);
    }

    private void quack(Duck... ducks) {
        for (Duck duck : ducks) {
            duck.quack();
        }
    }

    private void swim(Duck... ducks) {
        for (Duck duck : ducks) {
            duck.swim();
        }
    }

    public static void main(String[] args) {
        Pool pool = new Pool();
        pool.run();
    }
}
