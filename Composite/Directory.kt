public class Directory(name: String): Entry() {
    private val name: String;
    private val directory: ArrayList<Entry>;

    init {
        this.name = name;
        this.directory = ArrayList<Entry>();
    }

    override public fun getName(): String {
        return name;
    }

    override public fun getSize(): Int {
        var size = 0;
        directory.forEach { size += it.getSize() };
        return size;
    }

    override public fun add(entry: Entry): Entry {
        directory.add(entry);
        entry.parent = this;
        return this;
    }

    override internal fun printList(prefix: String) {
        println(String.format("%s/%s", prefix, this));
        directory.forEach { it.printList(String.format("%s/%s", prefix, name)) };
    }
}