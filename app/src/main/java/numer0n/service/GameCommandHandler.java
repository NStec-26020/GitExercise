package numer0n.service;

/**
 * 画面入力からコマンドに変換するクラス
 */
public interface GameCommandHandler {
    public String handle(String value) throws Exception;
}
