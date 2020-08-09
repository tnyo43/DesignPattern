class CharDisplayImpl(ch: Char, left: String, right: String): DisplayImpl() {
    private val ch: Char;
    private val left: String;
    private val right: String;
    

    init {
        this.ch = ch;
        this.left = left;
        this.right = right;
    }

    override public fun rawOpen() {
        print(left);
    }

    override public fun rawPrint() {
        print(ch);
    }

    override public fun rawClose() {
        println(right);
    }
}