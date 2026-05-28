package numer0n.factory.util;

import numer0n.service.GameCommandHandler;
import numer0n.service.impl.GameCommandHandlerImpl;

public interface GameCommandHandlerFactory {
    public static GameCommandHandler create() {
        return new GameCommandHandlerImpl();
    }
}
