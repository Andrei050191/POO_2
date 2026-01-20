package org.example;

import first.CounterOutTask;
import first.OutTask;
import first.RandomOutTask;
import first.Task;
import second.Container;
import third.ContainerFactory;
import third.Strategy;
import fourth.PrintTimeTaskRunner;
import fourth.CounterTaskRunner;
import fourth.RedoBackTaskRunner;

public class Main {
    public static void main(String[] args) {
        System.out.println("OutTask");
        Task outTask = new OutTask("Hello from OutTask");
        outTask.execute();

        System.out.println("\nRandomOutTask");
        Task randomTask1 = new RandomOutTask();
        Task randomTask2 = new RandomOutTask();
        randomTask1.execute();
        randomTask2.execute();

        System.out.println("\nCounterOutTask");
        Task counterTask = new CounterOutTask();
        counterTask.execute();
        counterTask.execute();
        counterTask.execute();

        System.out.println("\nStack LIFO");
        Container stack = ContainerFactory.getInstance().createContainer(Strategy.LIFO);
        stack.push(new OutTask("First task"));
        stack.push(new OutTask("Second task"));
        stack.push(new OutTask("Third task"));
        System.out.println("Popping from stack");
        while (!stack.isEmpty()) {
            stack.pop().execute();
        }

        System.out.println("\nQueue FIFO");
        Container queue = ContainerFactory.getInstance().createContainer(Strategy.FIFO);
        queue.push(new OutTask("First task"));
        queue.push(new OutTask("Second task"));
        queue.push(new OutTask("Third task"));
        System.out.println("Popping from queue");
        while (!queue.isEmpty()) {
            queue.pop().execute();
        }

        System.out.println("\nContainerFactory Singleton");
        ContainerFactory factory1 = ContainerFactory.getInstance();
        ContainerFactory factory2 = ContainerFactory.getInstance();
        System.out.println("Same instance " + (factory1 == factory2));

        System.out.println("\nPrintTimeTaskRunner");
        PrintTimeTaskRunner timeRunner = new PrintTimeTaskRunner();
        timeRunner.setTask(new OutTask("Task with time"));
        timeRunner.executeTask();

        System.out.println("\nCounterTaskRunner");
        CounterTaskRunner counterRunner = new CounterTaskRunner();
        counterRunner.setTask(new OutTask("Counted task"));
        counterRunner.executeTask();
        counterRunner.executeTask();
        counterRunner.executeTask();
        System.out.println("Tasks executed " + counterRunner.getCounter());

        System.out.println("\nRedoBackTaskRunner");
        RedoBackTaskRunner redoRunner = new RedoBackTaskRunner();
        redoRunner.setTask(new OutTask("Task A"));
        redoRunner.executeTask();
        redoRunner.setTask(new OutTask("Task B"));
        redoRunner.executeTask();
        redoRunner.setTask(new OutTask("Task C"));
        redoRunner.executeTask();
        System.out.println("Redo in reverse order");
        redoRunner.redo();
    }
}
