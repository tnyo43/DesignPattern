public class IncrementalNumberGenerator(start: Int, end: Int, diff: Int): NumberGenerator() {
    private val start: Int;
    private val end: Int;
    private val diff: Int;
    private var number: Int;

    init {
        this.start = start;
        this.end = end;
        this.diff = diff;
        this.number = 0;
    }

    override public fun getNumber(): Int = number;

    override public fun execute() {
        number = start;
        while (number < end) {
            notifyObservers();
            number += diff;
        }
    }
}