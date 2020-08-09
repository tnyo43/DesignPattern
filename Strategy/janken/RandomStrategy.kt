import java.util.Random;

public class RandomStrategy(seed: Long): Strategy {
    private val random: Random;

    init {
        this.random = Random(seed);
    }

    override public fun nextHand(): Hand = Hand.getHand(random.nextInt(3));

    override public fun study(win: Boolean) {}
}