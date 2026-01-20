package fourth;

public class CounterTaskRunner extends AbstractTaskRunner {
    private int counter = 0;

    @Override
    protected void afterTask() {
        counter++;
    }

    public int getCounter() {
        return counter;
    }
}
