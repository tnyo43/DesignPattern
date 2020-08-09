public class Hand {
    companion object {
        public val HAND_VALUE_GUU = 0;
        public val HAND_VALUE_CHO = 1;
        public val HAND_VALUE_PAA = 2;

        public val hand: List<Hand> = listOf(
            Hand(HAND_VALUE_GUU),
            Hand(HAND_VALUE_CHO),
            Hand(HAND_VALUE_PAA)
        );

        public val name: List<String> = listOf("グー", "チョキ", "パー");

        public fun getHand(handValue: Int) = hand[handValue];
    }

    private val handValue: Int;

    private constructor(handValue: Int) {
        this.handValue = handValue;
    }

    public fun isStrongerThan(h: Hand): Boolean = fight(h) == 1;
    public fun isWeakerThan(h: Hand): Boolean = fight(h) == -1;

    private fun fight(h: Hand): Int {
        if (this == h) return 0;
        if ((this.handValue + 1)%3 == h.handValue) return 1;
        return -1;
    }

    override public fun toString(): String = name[this.handValue];
}