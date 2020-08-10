public class FullBorder(display: Display): Border(display) {
    companion object {
        private val SIDE_BORDER = '+';
        private val UP_DOWN_BORDER = '-';
    }

    override public fun getColumns(): Int =
        display.getColumns() + 2;

    override public fun getRows(): Int =
        display.getRows() + 2;

    override public fun getRowText(row: Int): String =
        if (row == 0 || row == getRows()-1)
            SIDE_BORDER + String(CharArray(getColumns()-2, { _ -> UP_DOWN_BORDER })) + SIDE_BORDER
        else if (row < getRows())
            SIDE_BORDER + display.getRowText(row-1) + SIDE_BORDER
        else
            throw Exception();
}