public class OddSupport(name: String): Support(name) {
    override protected fun resolve(trouble: Trouble): Boolean =
        trouble.getNumber() % 2 == 1;
}