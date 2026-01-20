package second;

import first.Task;

public interface Container {
    Task pop();
    void push(Task task);
    int size();
    boolean isEmpty();
}
