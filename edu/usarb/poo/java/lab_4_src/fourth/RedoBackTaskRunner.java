package usarb.poo.java.lab_4.src.fourth;

import usarb.poo.java.lab_4.src.first.Task;
import usarb.poo.java.lab_4.src.second.*;

public class RedoBackTaskRunner extends AbstractTaskRunner {

    private Container history = new Stack();

    public RedoBackTaskRunner(Container c) {
        super(c);
    }

    @Override
    protected void afterExecution(Task task) {
        history.push(task);
    }

    public void redo() {
        while (!history.isEmpty()) {
            history.pop().execute();
        }
    }
}
