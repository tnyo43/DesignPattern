import java.util.Random;

public class WinningStrategy(seed: Long): Strategy {
    private val random: Random;
    private var won: Boolean;
    private var prevHand: Hand;

    init {
        this.random = Random(seed);
        this.won = false;
        this.prevHand = nextHand();
    }

    override public fun nextHand(): Hand {
        if (!won) {
            prevHand = Hand.getHand(random.nextInt(3));
        }
        return prevHand;
    }

    override public fun study(win: Boolean) {
        this.won = win;
    }
}