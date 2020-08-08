class Director(builder: Builder) {
    private val builder: Builder;

    init {
        this.builder = builder;
    }

    fun construct() {
        builder.makeTitle("Greeting");

        builder.makeString("朝から昼にかけて");
        builder.makeItems(listOf(
            "おはようございます",
            "こんにちは"
        ));

        builder.makeString("夜に");
        builder.makeItems(listOf(
            "こんばんは",
            "おやすみなさい"
        ));

        builder.close();
    }
}