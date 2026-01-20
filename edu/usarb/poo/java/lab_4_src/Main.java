
package usarb.poo.java.lab_4_src;

import usarb.poo.java.lab_4_src.first.*;
import usarb.poo.java.lab_4_src.second.*;
import usarb.poo.java.lab_4_src.third.*;
import usarb.poo.java.lab_4_src.fourth.*;

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
