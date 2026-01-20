package first;

import java.util.concurrent.ThreadLocalRandom;


public class RandomOutTask implements Task {
    private final double generatedNumber;

    public RandomOutTask() {
        this.generatedNumber = ThreadLocalRandom.current().nextDouble();
    }

    @Override
    public void execute() {
        System.out.println("Generated number: " + generatedNumber);
    }
}

