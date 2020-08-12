public class Trouble(number: Int) {
    private val number: Int;

    init {
        this.number = number;
    }

    public fun getNumber(): Int = number;

    override public fun toString(): String = String.format("[Trouble %d]", number);
}