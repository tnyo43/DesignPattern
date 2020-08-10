public abstract class Entry: Element {
    public abstract fun getName(): String;
    public abstract fun getSize(): Int;

    @Throws(FileTreatmentException::class)
    open public fun add(@SuppressWarnings("unused") entry: Entry): Entry {
        throw FileTreatmentException();
    }

    @Throws(FileTreatmentException::class)
    open public fun iterator(): Iterator<Entry> {
        throw FileTreatmentException();
    }

    override public fun toString(): String {
        return String.format("%s (%d)", getName(), getSize());
    }
}