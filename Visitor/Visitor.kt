public abstract class Visitor {
    public abstract fun visit(file: File);
    public abstract fun visit(directory: Directory);
}