package numer0n.factory.service;

import numer0n.service.NumeronManager;
import numer0n.service.impl.NumeronManagerImpl;

public interface NumeronManagerFactory {
    public static NumeronManager create() {
        return new NumeronManagerImpl();
    }
}
