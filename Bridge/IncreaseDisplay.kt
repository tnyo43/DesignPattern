open public class IncreaseDisplay(impl: DisplayImpl): Display(impl) {
    public fun increaseDisplay(level: Int) {
        for (l in 1..level) {
            open_();
            for (i in 1..(l-1)) {
                print();
            }
            close();
        }
    }
}