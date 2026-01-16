package usarb.poo.java.Lab_4.src.second;

import usarb.poo.java.Lab_4.src.first.Task;

public interface Container {
    void push(Task task);
    Task pop();
    int size();
    boolean isEmpty();
}


