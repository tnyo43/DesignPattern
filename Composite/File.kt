public class File(name: String, size: Int): Entry() {
    private val name: String;
    private val size: Int;

    init {
        this.name = name;
        this.size = size;
    }

    override public fun getName(): String {
        return name;
    }

    override public fun getSize(): Int {
        return size;
    }

    override internal fun printList(prefix: String) {
        println(String.format("%s/%s", prefix, toString()));
    }
}