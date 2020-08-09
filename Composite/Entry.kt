public abstract class Entry {
    internal var parent: Entry? = null;
    public abstract fun getName(): String;
    public abstract fun getSize(): Int;

    @Throws(FileTreatmentException::class)
    open public fun add(entry: Entry): Entry {
        throw FileTreatmentException();
    }

    public fun printList() {
        printList("");
    }

    internal abstract fun printList(prefix: String);

    override public fun toString(): String {
        return String.format("%s (%d)", getName(), getSize());
    }

    public fun getFullPath(): String =
        (if (parent == null) "" else parent!!.getFullPath()) + "/" + getName();
}