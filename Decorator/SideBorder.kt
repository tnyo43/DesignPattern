open public class SideBorder(display: Display, ch: Char): Border(display) {
    private val borderChar: Char;

    init {
        this.borderChar = ch;
    }

    override public fun getColumns(): Int =
        display.getColumns() + 2
    
    override public fun getRows(): Int =
        display.getRows();

    override public fun getRowText(row: Int) =
        if (row < getRows())
            borderChar + display.getRowText(row) + borderChar
        else
            throw Exception();
}