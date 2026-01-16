package usarb.poo.java.Lab_4.src.second;

import java.util.LinkedList;
import usarb.poo.java.Lab_4.src.first.Task;

public class Queue implements Container {
    private LinkedList<Task> list = new LinkedList<>();

    @Override
    public void push(Task task) {
        list.add(task);
    }

    @Override
    public Task pop() {
        return list.removeFirst();
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }
}


