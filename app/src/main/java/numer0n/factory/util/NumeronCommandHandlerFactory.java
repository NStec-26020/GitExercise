package numer0n.factory.util;

import numer0n.service.NumeronCommandHandler;
import numer0n.service.impl.NumeronCommandHandlerImpl;

public interface NumeronCommandHandlerFactory {
    public static NumeronCommandHandler create() {
        return new NumeronCommandHandlerImpl();
    }
}
