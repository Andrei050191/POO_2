package usarb.poo.java.lab_4_src.second;

import usarb.poo.java.lab_4_src.first.Task;
import java.util.LinkedList;

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
