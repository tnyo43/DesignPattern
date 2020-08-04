open class Banner(str: String) {
    private val str: String;
    init {
        this.str = str;
    }

    open fun showWithParen() {
        println("(" + this.str + ")");
    }

    open fun showWithAster() {
        println("*" + this.str + "*");
    }
}