class StringDisplayImpl(str: String): DisplayImpl() {
    private val str: String;
    private val width: Int;

    init {
        this.str = str;
        this.width = str.toByteArray().size;
    }

    override public fun rawOpen() {
        printLine();
    }

    override public fun rawPrint() {
        println(String.format("|%s|", str));
    }

    override public fun rawClose() {
        printLine();
    }

    private fun printLine() {
        print('+');
        for (i in 1..width) print('-');
        println('+');
    }
}