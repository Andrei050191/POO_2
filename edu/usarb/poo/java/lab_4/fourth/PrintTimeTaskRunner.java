package usarb.poo.java.lab_4.fourth;

import usarb.poo.java.lab_4.first.Task;
import usarb.poo.java.lab_4.second.Container;
import java.util.Date;

public class PrintTimeTaskRunner extends AbstractTaskRunner {

    public PrintTimeTaskRunner(Container c) {
        super(c);
    }

    @Override
    protected void afterExecution(Task task) {
        System.out.println("Executed at: " + new Date());
    }
}
