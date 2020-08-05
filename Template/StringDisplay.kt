class StringDisplay(str: String) : AbstractDisplay() {
    private val str: String;
    private val width: Int;

    init {
        this.str = str;
        this.width = getByteLength(str);
    }

    override fun open() {
        printLine();
    }

    override fun print() {
        println("|" + this.str + "|");
    }

    override fun close() {
        printLine();
    }

    fun printLine() {
        print("+");
        for (i in 1..width) {
            print("-");
        }
        println("+");
    }

    private fun getByteLength(str: String): Int {
        // 単純なString#toByteArray()がJavaと同じように動かないので
        return str
                .map { it.toString().toByteArray().size }
                .map { if (it > 2) 2 else 1 }
                .sum();
    }
}