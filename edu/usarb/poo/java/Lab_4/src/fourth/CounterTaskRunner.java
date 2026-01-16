package usarb.poo.java.Lab_4.src.fourth;

import usarb.poo.java.Lab_4.src.first.Task;
import usarb.poo.java.Lab_4.src.second.Container;

public class CounterTaskRunner extends AbstractTaskRunner {

    private int count = 0;

    public CounterTaskRunner(Container c) {
        super(c);
    }

    @Override
    protected void afterExecution(Task task) {
        count++;
        System.out.println("Executed tasks: " + count);
    }
}


