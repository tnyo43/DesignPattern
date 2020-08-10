public class StringDisplay(str: String): Display() {
    private val str: String;

    init {
        this.str = str;
    }

    override public fun getColumns(): Int =
        str.toByteArray().size;

    override public fun getRows(): Int =
        1;
    
    override public fun getRowText(row: Int): String =
        if (row == 0) str else throw Exception();
}