import kotlin.system.exitProcess;

val bsArray = MutableList<BigString?>(1000, { _ -> null });

fun showMemory() {
    Runtime.getRuntime().gc();
    val used = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
    println(String.format("使用メモリ = %d", used));
}

fun testAllocation(shared: Boolean) {
    for (i in 0..(bsArray.size-1)) {
        bsArray[i] = BigString("1212123", shared);
    }
    showMemory();
}

fun main() {
    println("共有した場合");
    testAllocation(true);
    println("共有しない場合");
    testAllocation(false);
}