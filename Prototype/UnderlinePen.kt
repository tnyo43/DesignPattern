import framework.*;

class UnderLine(ulchar: Char): Product() {
    private val ulchar: Char;

    init {
        this.ulchar = ulchar;
    }

    override fun use(s: String) {
        val len = s.toByteArray().size;
        println("\"" + s + "\"");
        print(" ");
        for (i in 1..len) print(this.ulchar);
        println();
    }
}