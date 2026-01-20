package usarb.poo.java.lab_4_src.fourth;

import usarb.poo.java.lab_4_src.first.Task;
import usarb.poo.java.lab_4_src.second.Container;
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
