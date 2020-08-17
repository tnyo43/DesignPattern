public class DigitObserver(): Observer {
    override public fun update(generator: NumberGenerator) {
        println("DigirObserver: " + generator.getNumber());
        try {
            Thread.sleep(100);
        } catch (e: InterruptedException) {
        }
    }
}