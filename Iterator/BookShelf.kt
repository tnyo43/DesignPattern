class BookShelf: Aggregate {
    private var books: ArrayList<Book>;
    private var last = 0;

    constructor() {
        this.books = ArrayList<Book>();
    }

    public fun getBookAt(index: Int): Book =
        books[index];
    
    public fun appendBook(book: Book) {
        this.books.add(book);
    }

    public fun getLength() = this.books.size;

    override public fun iterator(): Iterator = BookShelfIterator(this);
}