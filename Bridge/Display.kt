open class Display(impl: DisplayImpl) {
    private val impl: DisplayImpl;

    init {
        this.impl = impl;
    }

    public fun open_() {
        impl.rawOpen();
    }

    public fun print() {
        impl.rawPrint();
    }

    public fun close() {
        impl.rawClose();
    }

    public final fun display() {
        open_();
        print();
        close();
    }
}