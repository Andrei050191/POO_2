package second;

import first.Task;

public class Queue extends AbstractContainer {
    @Override
    public Task pop() {
        if (isEmpty()) {
            return null;
        }
        return tasks.remove(0);
    }
}
