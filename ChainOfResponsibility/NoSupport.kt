public class NoSupport(name: String): Support(name) {
    override protected fun resolve(trouble: Trouble): Boolean = false;
}