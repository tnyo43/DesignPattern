class Triple {
    companion object {
        private val triple = listOf<Triple>(
            Triple(0),
            Triple(1),
            Triple(2)
        );

        fun getInstance(id: Int): Triple {
            return triple[id];
        }
    }

    private val id: Int;

    private constructor(id: Int) {
        this.id = id;
        println("The instance " + id + " is created");
    }

    override fun toString(): String {
        return "[Triple id=" + id + "]";
    }
}

fun main() {
    println("start");
    for (i in 0..8) {
        val triple = Triple.getInstance(i%3);
        println("" + i + ": " + triple);
    }
    println("end");
}