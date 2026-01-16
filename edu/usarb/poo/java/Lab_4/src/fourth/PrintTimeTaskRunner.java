package usarb.poo.java.Lab_4.src.fourth;

import usarb.poo.java.Lab_4.src.first.Task;
import usarb.poo.java.Lab_4.src.second.Container;
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


