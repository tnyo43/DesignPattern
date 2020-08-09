public interface Strategy {
    public fun nextHand(): Hand;
    public fun study(win: Boolean);
}