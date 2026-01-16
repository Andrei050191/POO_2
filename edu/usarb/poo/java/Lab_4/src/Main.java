
package usarb.poo.java.Lab_4.src;

import usarb.poo.java.Lab_4.src.first.*;
import usarb.poo.java.Lab_4.src.fourth.*;
import usarb.poo.java.Lab_4.src.second.*;
import usarb.poo.java.Lab_4.src.third.*;

public class Main {
    public static void main(String[] args) {
        Container c = ContainerFactory.getInstance()
                .createContainer(Strategy.STACK);

        AbstractTaskRunner runner =
                new PrintTimeTaskRunner(c);

        runner.addTask(new OutTask("Hello"));
        runner.addTask(new RandomOutTask());
        runner.addTask(new CounterOutTask());

        runner.executeAll();
    }
}


