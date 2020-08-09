open public class CountDisplay(impl: DisplayImpl): Display(impl) {
    public fun multiDisplay(times: Int) {
        open_();
        for (i in 1..times) {
            print();
        }
        close();
    }
}