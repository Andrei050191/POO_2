package usarb.poo.java.lab_4.src.second;

import usarb.poo.java.lab_4.src.first.Task;
import java.util.ArrayList;

public class Stack implements Container {
    private ArrayList<Task> list = new ArrayList<>();

    @Override
    public void push(Task task) {
        list.add(task);
    }

    @Override
    public Task pop() {
        return list.remove(list.size() - 1);
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
