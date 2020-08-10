public abstract class Display {
    public abstract fun getColumns(): Int;
    public abstract fun getRows(): Int;
    public abstract fun getRowText(row: Int): String;

    public fun show() {
        for (r in (0..getRows()-1)) {
            println(getRowText(r));
        }
    }
}
