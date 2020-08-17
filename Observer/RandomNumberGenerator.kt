import java.util.Random;

public class RandomNumberGenerator: NumberGenerator() {
    private val random: Random;
    private var number: Int;
    
    init {
        this.random = Random();
        this.number = 0;
    }

    override public fun getNumber(): Int = number;

    override public fun execute() {
        for (i in 1..20) {
            number = this.random.nextInt(50);
            notifyObservers();
        }
    }
}