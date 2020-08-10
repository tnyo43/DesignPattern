public class FileVisitor: Visitor {
    private val extention: String;
    private val targets: ArrayList<File>

    constructor(extention: String): super() {
        this.extention = extention;
        this.targets = ArrayList();
    }

    override public fun visit(file: File) {
        if (file.getName().endsWith(this.extention))
            targets.add(file);
    }

    override public fun visit(directory: Directory) {
        val it = directory.iterator();
        while (it.hasNext()) {
            val entry = it.next();
            entry.accept(this);
        }
    }

    public fun getFoundFiles(): Iterator<File> {
        return targets.iterator();
    }
}