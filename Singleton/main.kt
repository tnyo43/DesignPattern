fun main() {
    println("start");
    val obj1: Singleton = Singleton.getInstance();
    val obj2: Singleton = Singleton.getInstance();
    println(if (obj1 == obj2) "same" else "different");
    println("end");
}