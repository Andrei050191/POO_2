package usarb.poo.java.Lab_4.src.fourth;

import usarb.poo.java.Lab_4.src.first.Task;
import usarb.poo.java.Lab_4.src.second.Container;

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


