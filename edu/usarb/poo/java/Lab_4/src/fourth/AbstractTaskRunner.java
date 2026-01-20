package fourth;

import first.Task;

public abstract class AbstractTaskRunner {
    protected Task task;

    public void setTask(Task task) {
        this.task = task;
    }

    public void executeTask() {
        beforeTask();
        task.execute();
        afterTask();
    }

    protected void beforeTask() {
    }

    protected void afterTask() {
    }
}
