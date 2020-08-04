class PrintBanner(str: String): Print() {
    private var banner: Banner;

    init {
        this.banner = Banner(str);
    }

    override fun printWeek() {
        this.banner.showWithParen();
    }

    override fun printStrong() {
        this.banner.showWithAster();
    }
}