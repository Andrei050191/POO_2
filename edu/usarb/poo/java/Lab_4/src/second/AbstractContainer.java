package second;

import first.Task;
import java.util.ArrayList;

public abstract class AbstractContainer implements Container {
    protected ArrayList<Task> tasks = new ArrayList<>();

    @Override
    public void push(Task task) {
        tasks.add(task);
    }

    @Override
    public int size() {
        return tasks.size();
    }

    @Override
    public boolean isEmpty() {
        return tasks.isEmpty();
    }
}
