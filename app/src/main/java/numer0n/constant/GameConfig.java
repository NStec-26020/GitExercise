package numer0n.constant;

import java.util.Map;

/**
 * ゲーム設定を管理する定数クラス
 */
public final class GameConfig {
    public static final int MAX_TURN = 10;

    public static final int ITEM_CAN_USE_COUNT = 1;

    public static final int NUMBER_DIGITS = 3;

    public static final String CONTINUE = "Continue";

    public static final String EXIT = "Exit";

    public static final String USE_ITEM = "UseItem";

    public static final String GIVE_UP = "GiveUp";

    public static final String ANSWER = "Answer";

    public static final Map<String, String> NUMERON_COMMANDS =
            Map.of("h", USE_ITEM, "s", USE_ITEM, "u", USE_ITEM, "g", GIVE_UP, "a", ANSWER);

    public static final Map<String, String> GAME_COMMANDS = Map.of("y", CONTINUE, "n", EXIT);

    private GameConfig() {}
}

