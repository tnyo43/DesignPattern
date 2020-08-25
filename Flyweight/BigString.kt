public class BigString {
    private val bigchars: List<BigChar>;

    constructor(string: String) {
        bigchars = initShared(string);
    }

    constructor(string: String, shared: Boolean) {
        bigchars = if (shared) initShared(string) else initUnshared(string);
    }

    private fun initShared(string: String): List<BigChar> {
        val factory = BigCharFactory.getInstance();
        return string.toCharArray().map { factory.getBigChar(it) };
    }

    private fun initUnshared(string: String): List<BigChar> {
        return string.toCharArray().map { BigChar(it) };
    }

    public fun print() {
        bigchars.forEach { it.print() };
    }
}