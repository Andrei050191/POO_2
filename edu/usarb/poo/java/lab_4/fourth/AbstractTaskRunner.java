package usarb.poo.java.lab_4.fourth;

import usarb.poo.java.lab_4.first.Task;
import usarb.poo.java.lab_4.second.Container;

public abstract class AbstractTaskRunner {
    protected Container container;

    public AbstractTaskRunner(Container container) {
        this.container = container;
    }

    public void addTask(Task task) {
        container.push(task);
    }

    public void executeAll() {
        while (!container.isEmpty()) {
            Task task = container.pop();
            task.execute();
            afterExecution(task);
        }
    }

    protected abstract void afterExecution(Task task);
}
