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
        val sizeVisitor = SizeVisitor();
        accept(sizeVisitor);
        return sizeVisitor.getSize();
    }

    override public fun add(entry: Entry): Entry {
        directory.add(entry);
        return this;
    }

    override public fun iterator(): Iterator<Entry> {
        return directory.iterator();
    }

    override public fun accept(visitor: Visitor) {
        visitor.visit(this);
    }
}