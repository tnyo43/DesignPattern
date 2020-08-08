class TextBuilder: Builder() {
    private val buffer = StringBuffer();

    protected override fun buildTitle(title: String) {
        buffer.append("=============================\n");
        buffer.append("\"" + title + "\"\n\n");
    }

    protected override fun buildString(str: String) {
        buffer.append("- " + str + "\n\n");
    }

    protected override fun buildItems(items: List<String>) {
        items.forEach {
            buffer.append("  * " + it + '\n');
        };
        buffer.append('\n');
    }

    protected override fun buildDone() {
        buffer.append("=============================\n");
    }

    public fun getResult(): String {
        return buffer.toString();
    }
}