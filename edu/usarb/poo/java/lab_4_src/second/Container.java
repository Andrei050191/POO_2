package usarb.poo.java.lab_4_src.second;

import usarb.poo.java.lab_4_src.first.Task;

public interface Container {
    void push(Task task);
    Task pop();
    int size();
    boolean isEmpty();
}
