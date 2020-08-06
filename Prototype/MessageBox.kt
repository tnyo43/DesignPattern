import framework.*;

class MessageBox(decochar: Char): Product() {
    private val decochar: Char;

    init {
        this.decochar = decochar;
    }

    override fun use(s: String) {
        val len = s.toByteArray().size + 4;
        for (i in 1..len) print(this.decochar);
        println();
        println(this.decochar + " " + s + " " + this.decochar);
        for (i in 1..len) print(this.decochar);
        println();
    }
}