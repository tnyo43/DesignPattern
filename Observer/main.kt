fun main() {
    val generator: NumberGenerator = RandomNumberGenerator();
    val observer1: Observer = DigitObserver();
    val observer2: Observer = GraphObserver();
    val observer17_2: Observer = FrameObserver();
    generator.addObserver(observer1);
    generator.addObserver(observer2);
    generator.addObserver(observer17_2);
    generator.execute();
    println();

    val generator17_1: NumberGenerator = IncrementalNumberGenerator(10, 50, 5);
    generator17_1.addObserver(observer1);
    generator17_1.addObserver(observer2);
    generator17_1.addObserver(observer17_2);
    generator17_1.execute();
}