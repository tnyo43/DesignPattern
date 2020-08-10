public class ListVisitor: Visitor {
    private var currentdir: String;

    constructor(): super() {
        this.currentdir = "";
    }

    override public fun visit(file: File) {
        println(String.format("%s/%s", currentdir, file.toString()));
    }

    override public fun visit(directory: Directory) {
        println(String.format("%s/%s", currentdir, directory.toString()));
        val savedir = currentdir;
        currentdir += "/" + directory.getName();
        val it = directory.iterator();
        while (it.hasNext()) {
            val entry = it.next();
            entry.accept(this);
        }
        currentdir = savedir;
    }
}