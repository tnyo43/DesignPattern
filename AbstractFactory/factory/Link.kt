package factory;

public abstract class Link: Item {
    protected val url: String;

    constructor(caption: String, url: String): super(caption) {
        this.url = url;
    }
}