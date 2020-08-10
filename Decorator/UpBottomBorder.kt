open public class UpBottomBorder(display: Display, ch: Char): Border(display) {
    private val borderChar: Char;

    init {
        this.borderChar = ch;
    }

    override public fun getColumns(): Int =
        display.getColumns()
    
    override public fun getRows(): Int =
        display.getRows() + 2;

    override public fun getRowText(row: Int) =
        if (row == 0 || row == getRows()-1)
            String(CharArray(getColumns(), { _ -> borderChar }))
        else if (row < getRows())
            display.getRowText(row-1)
        else
            throw Exception();
}