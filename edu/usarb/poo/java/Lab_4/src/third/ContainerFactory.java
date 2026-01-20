package third;

import second.Container;
import second.Queue;
import second.Stack;

public class ContainerFactory implements IFactory {
    private static ContainerFactory instance = null;

    private ContainerFactory() {
    }

    public static ContainerFactory getInstance() {
        if (instance == null) {
            instance = new ContainerFactory();
        }
        return instance;
    }

    @Override
    public Container createContainer(Strategy strategy) {
        return switch (strategy) {
            case LIFO -> new Stack();
            case FIFO -> new Queue();
        };
    }
}
