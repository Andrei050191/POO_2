package second;

import first.Task;

public class Stack extends AbstractContainer {
    @Override
    public Task pop() {
        if (isEmpty()) {
            return null;
        }
        return tasks.remove(tasks.size() - 1);
    }
}
