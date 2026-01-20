package usarb.poo.java.lab_4.second;

import usarb.poo.java.lab_4.first.Task;

public interface Container {
    void push(Task task);
    Task pop();
    int size();
    boolean isEmpty();
}
