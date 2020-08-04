public class BookShelfIterator: Iterator {
    private val bookShelf: BookShelf;
    private var index: Int;

    constructor(bookShelf: BookShelf) {
        this.bookShelf = bookShelf;
        this.index = 0;
    }

    override public fun hasNext(): Boolean =
        this.index < bookShelf.getLength();
    
    override public fun next(): Any {
        val book = this.bookShelf.getBookAt(this.index);
        this.index++;
        return book;
    }
}