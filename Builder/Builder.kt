abstract class Builder {
    private var isInitialized = false;

    public fun makeTitle(title: String) {
        if (isInitialized) {
            throw Exception();
        }
        buildTitle(title);
        isInitialized = true;
    }

    public fun makeString(str: String) {
        if (!isInitialized) {
            throw Exception();
        }
        buildString(str);
    }
    public fun makeItems(items: List<String>) {
        if (!isInitialized) {
            throw Exception();
        }
        buildItems(items);
    }

    public fun close() {
        if (!isInitialized) {
            throw Exception();
        }
        buildDone();
    }

    protected abstract fun buildTitle(title: String);
    protected abstract fun buildString(str: String);
    protected abstract fun buildItems(items: List<String>);
    protected abstract fun buildDone();
}