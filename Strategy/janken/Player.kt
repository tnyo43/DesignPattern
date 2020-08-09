public class Player(name: String, strategy: Strategy) {
    private val name: String;
    private val strategy: Strategy;
    private var winCount: Int;
    private var loseCount: Int;
    private var gameCount: Int;

    init {
        this.name = name;
        this.strategy = strategy

        this.winCount = 0;
        this.loseCount = 0;
        this.gameCount = 0;
    }

    public fun nextHand(): Hand {
        return strategy.nextHand();
    }

    public fun win() {
        strategy.study(true);
        this.gameCount++;
        this.winCount++;
    }

    public fun lose() {
        strategy.study(false);
        this.gameCount++;
        this.loseCount++;
    }

    public fun even() {
        this.gameCount++;
    }

    override fun toString(): String {
        return String.format("[%s: %d games, %d win, %d lose]", name, gameCount, winCount, loseCount);
    }
}