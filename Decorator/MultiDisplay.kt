public class MultiDisplay(): Display() {
    private val strs: ArrayList<String>;

    init {
        strs = ArrayList<String>();
    }

    public fun add(str: String) {
        strs.add(str);
    }

    override public fun getColumns(): Int =
        strs.map { it.toByteArray().size }.max() ?: 0;

    override public fun getRows(): Int =
        strs.size;
    
    override public fun getRowText(row: Int): String {
        val str = strs.get(row);
        return str + String(CharArray(getColumns() - str.length, { _ -> ' ' }));
    }
}