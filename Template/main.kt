fun main() {
    val d1: AbstractDisplay = CharDisplay('H');
    val d2: AbstractDisplay = StringDisplay("Hello, World!");
    val d3: AbstractDisplay = StringDisplay("こんにちは");

    val arr = arrayOf(d1, d2, d3);
    arr.forEach { d ->
        d.display();
    }
}