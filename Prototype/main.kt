import framework.*;

fun main() {
    val upen = UnderLine('~');
    val mbox = MessageBox('/');
    val sbox = MessageBox('7');

    val manager = Manager();
    manager.register("strong message", upen);
    manager.register("warning box", mbox);
    manager.register("luckey box", sbox);

    val p1 = manager.create("strong message");
    val p2 = manager.create("warning box");
    val p3 = manager.create("luckey box");

    for (p in listOf(p1, p2, p3)) {
        p.use("Hello, World!");
    }
}