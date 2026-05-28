package numer0n.service.impl;

import numer0n.constant.GameConfig;
import numer0n.exception.KeyNotFoundException;
import numer0n.service.GameCommandHandler;

public class GameCommandHandlerImpl implements GameCommandHandler {

    public GameCommandHandlerImpl() {}

    @Override
    public String handle(String value) throws KeyNotFoundException {
        if (value.length() == 1) {
            if (!GameConfig.GAME_COMMANDS.containsKey(value)) {
                throw new KeyNotFoundException();
            }

            return GameConfig.GAME_COMMANDS.get(value);
        } else {
            throw new KeyNotFoundException();
        }
    }

}
