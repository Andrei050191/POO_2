package fourth;

import first.Task;
import second.Container;
import third.ContainerFactory;
import third.Strategy;

public class RedoBackTaskRunner extends AbstractTaskRunner {
    private Container executedTasks;

    public RedoBackTaskRunner() {
        this.executedTasks = ContainerFactory.getInstance().createContainer(Strategy.LIFO);
    }

    @Override
    protected void afterTask() {
        executedTasks.push(task);
    }

    public void redo() {
        while (!executedTasks.isEmpty()) {
            Task task = executedTasks.pop();
            task.execute();
        }
    }
}
