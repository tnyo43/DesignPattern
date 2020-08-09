public class RandomCountDisplay(impl: DisplayImpl): CountDisplay(impl) {
    public fun randomDisplay(maxCount: Int) {
        val times = (1 until maxCount).random();
        multiDisplay(times);
    }
}