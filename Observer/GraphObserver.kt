public class GraphObserver(): Observer {
    override public fun update(generator: NumberGenerator) {
        println(
            "GraphObserver: " + 
            (1..generator.getNumber()).map { _ -> '*' }.joinToString("") { Character.toString(it) }
        );
        try {
            Thread.sleep(100);
        } catch (e: InterruptedException) {
        }
    }
}