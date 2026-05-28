package numer0n.util;

/**
 * 画面入力を受け取るクラス
 */
public interface InputCommand {
    public void input(String message);

    public String getText();

    public boolean isEmpty();

    public boolean isError();
}
