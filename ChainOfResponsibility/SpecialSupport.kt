public class SpecialSupport(name: String, number: Int): Support(name) {
    private val number: Int;

    init {
        this.number = number;
    }

    override protected fun resolve(trouble: Trouble): Boolean =
        trouble.getNumber() == number;
}