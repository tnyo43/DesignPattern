class PrintBanner(str: String) : Banner(str), Print {

    override fun printWeek() {
        showWithParen();
    }

    override fun printStrong() {
        showWithAster();
    };
}