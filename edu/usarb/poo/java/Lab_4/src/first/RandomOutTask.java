package usarb.poo.java.Lab_4.src.first;

import java.util.Random;

public class RandomOutTask implements Task {
    private int number;

    public RandomOutTask() {
        number = new Random().nextInt(100);
    }

    @Override
    public void execute() {
        System.out.println("Random number: " + number);
    }
}


