package third;

import second.Container;

public interface IFactory {
    Container createContainer(Strategy strategy);
}
