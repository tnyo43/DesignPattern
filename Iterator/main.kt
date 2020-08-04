fun main() {
    val bookShelf = BookShelf();
    bookShelf.appendBook(Book("Momo Taro"));
    bookShelf.appendBook(Book("Urashima Taro"));
    bookShelf.appendBook(Book("Kaguya Hime"));
    bookShelf.appendBook(Book("Aka zuikin"));
    bookShelf.appendBook(Book("Ookina Kabu"));
    bookShelf.appendBook(Book("3bikino kobuta"));

    val it: Iterator = bookShelf.iterator();
    while (it.hasNext()) {
        val book: Book = it.next() as Book;
        println(book.getName());
    }
}