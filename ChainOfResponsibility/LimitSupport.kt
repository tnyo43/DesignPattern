public class LimitSupport(name: String, limit: Int): Support(name) {
    private val limit: Int;

    init {
        this.limit = limit;
    }

    override protected fun resolve(trouble: Trouble): Boolean =
        trouble.getNumber() < limit;
}