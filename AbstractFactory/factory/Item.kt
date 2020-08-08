package factory;

public abstract class Item(caption: String): HTMLable {
    protected val caption: String;

    init {
        this.caption = caption;
    }
}