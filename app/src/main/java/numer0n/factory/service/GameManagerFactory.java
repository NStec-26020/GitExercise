package numer0n.factory.service;

import numer0n.service.GameManager;
import numer0n.service.impl.GameManagerImpl;

public interface GameManagerFactory {
    public static GameManager create() {
        return new GameManagerImpl();
    }
}
