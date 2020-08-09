import java.util.Random;

public class ProbStrategy(seed: Long): Strategy {
    private val random: Random;
    private val gameCount: List<Array<Int>>;
    private val winCount: List<Array<Int>>;
    private var prevHandValue: Int;
    private var currHandValue: Int;

    init {
        this.random = Random(seed);
        this.prevHandValue = random.nextInt(3);
        this.currHandValue = random.nextInt(3);

        this.gameCount = listOf(
            arrayOf(0, 0, 0),
            arrayOf(0, 0, 0),
            arrayOf(0, 0, 0)
        );
        this.winCount = listOf(
            arrayOf(0, 0, 0),
            arrayOf(0, 0, 0),
            arrayOf(0, 0, 0)
        );
    }

    private fun decide(probG: Double, probC: Double, probP: Double): Int {
        val r = random.nextDouble() * (probG + probC + probP);
        if (r <= probG) return 0;
        if (r <= probG + probC) return 1;
        return 2;
    }

    private fun getProb(next: Int): Double {
        return if (gameCount[prevHandValue][next] == 0) 0.5
                    else 1.0*winCount[prevHandValue][next]/gameCount[prevHandValue][next];
    }

    override public fun nextHand(): Hand {
        prevHandValue = currHandValue;
        currHandValue = decide(
            getProb(0),
            getProb(1),
            getProb(2)
        );
        gameCount[prevHandValue][currHandValue]++;
        return Hand.getHand(currHandValue);
    }

    override public fun study(win: Boolean) {
        if (!win) return;
        winCount[prevHandValue][currHandValue]++;
    }
}