package usarb.poo.java.lab_4.first;

public class CounterOutTask implements Task {
    private static int counter = 0;

    @Override
    public void execute() {
        counter++;
        System.out.println("Counter: " + counter);
    }
}
