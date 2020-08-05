class CharDisplay(ch: Char): AbstractDisplay() {
    private val ch: Char;

    init {
        this.ch = ch;
    }

    override fun open() {
        print("<<");
    }

    override fun print() {
        print(ch);
    }

    override fun close() {
        println(">>")
    }
}