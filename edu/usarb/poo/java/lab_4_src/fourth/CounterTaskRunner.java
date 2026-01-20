package usarb.poo.java.lab_4_src.fourth;

import usarb.poo.java.lab_4_src.first.Task;
import usarb.poo.java.lab_4_src.second.Container;

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
