public class SizeVisitor: Visitor {
    private var size: Int;

    constructor(): super() {
        size = 0;
    }

    override public fun visit(file: File) {
        size += file.getSize();
    }

    override public fun visit(directory: Directory) {
        val it = directory.iterator();
        while (it.hasNext()) {
            val entry = it.next();
            size += entry.getSize();
        }
    }

    public fun getSize(): Int {
        return size;
    }
}