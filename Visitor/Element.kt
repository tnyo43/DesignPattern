public interface Element {
    public abstract fun accept(visitor: Visitor);
}