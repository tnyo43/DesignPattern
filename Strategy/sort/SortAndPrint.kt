public class SortAndPrint<T: Comparable<T>>(data_: Array<T>, sorter: Sorter<T>) {
    val data_: Array<T>;
    val sorter: Sorter<T>;

    init {
        this.data_ = data_;
        this.sorter = sorter;
    }

    public fun execute() {
        print();
        sorter.sort(data_);
        print();
    }

    public fun print() {
        data_.forEach { print(it.toString() + " ") }
        println();
    }
}