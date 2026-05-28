package numer0n.item;

public abstract class AbstractItem implements Item {
    private boolean canUse;

    public boolean canUse() {
        return this.canUse;
    }

    public abstract void execute();
}
