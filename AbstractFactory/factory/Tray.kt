package factory;
import java.util.ArrayList;

public abstract class Tray(caption: String): Item(caption) {
    protected val tray = ArrayList<Item>();

    public fun add(item: Item) {
        tray.add(item);
    }
}