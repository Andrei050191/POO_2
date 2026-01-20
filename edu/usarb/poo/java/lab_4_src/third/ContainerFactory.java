package usarb.poo.java.lab_4_src.third;

import usarb.poo.java.lab_4_src.second.*;

public class ContainerFactory {

    private static ContainerFactory instance;

    private ContainerFactory() {}

    public static ContainerFactory getInstance() {
        if (instance == null)
            instance = new ContainerFactory();
        return instance;
    }

    public Container createContainer(Strategy strategy) {
        if (strategy == Strategy.STACK)
            return new Stack();
        else
            return new Queue();
    }
}
