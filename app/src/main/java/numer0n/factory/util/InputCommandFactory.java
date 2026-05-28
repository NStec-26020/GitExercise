package numer0n.factory.util;

import numer0n.util.InputCommand;
import numer0n.util.impl.InputCommandImpl;

public interface InputCommandFactory {
    public static InputCommand create() {
        return new InputCommandImpl();
    }
}
