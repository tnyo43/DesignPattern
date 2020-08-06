class TicketMaker {
    private var ticket: Int = 1000;

    companion object {
        private val singleton = TicketMaker();

        fun getInstance(): TicketMaker {
            return singleton;
        }
    }

    private constructor() {
    }

    @Synchronized
    fun getNextTicketNumber(): Int {
        return ticket++;
    }
}

fun main() {
    println("start");
    for (i in 1..10) {
        println("" + i + ": " + TicketMaker.getInstance().getNextTicketNumber());
    }
    println("end");
}