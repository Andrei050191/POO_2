
package usarb.poo.java.lab_4;

import usarb.poo.java.lab_4.first.*;
import usarb.poo.java.lab_4.second.*;
import usarb.poo.java.lab_4.third.*;
import usarb.poo.java.lab_4.fourth.*;

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
