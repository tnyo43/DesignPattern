fun main() {
    val d1: Display = Display(StringDisplayImpl("Hello, Japan"));
    val d2: Display = CountDisplay(StringDisplayImpl("Hello, World"));
    val d3: CountDisplay = CountDisplay(StringDisplayImpl("Hello, Universe"));
    val d9_1: RandomCountDisplay = RandomCountDisplay(StringDisplayImpl("Hello, God"));
    val d9_2: CountDisplay = CountDisplay(FileDisplayImpl("hello.txt"));
    val d9_3_1: IncreaseDisplay = IncreaseDisplay(CharDisplayImpl('*', "<", ">"));
    val d9_3_2: IncreaseDisplay = IncreaseDisplay(CharDisplayImpl('#', "| ", " -"));

    d1.display();
    d2.display();
    d3.display();
    d3.multiDisplay(5);
    d9_1.randomDisplay(10);
    d9_2.multiDisplay(3);
    d9_3_1.increaseDisplay(5);
    d9_3_2.increaseDisplay(3);
}