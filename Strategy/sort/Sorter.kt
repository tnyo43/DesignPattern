public abstract class Sorter<T: Comparable<T>> {
    public abstract fun sort(data_: Array<T>);

    protected fun swap(data_: Array<T>, i: Int, j: Int) {
        val tmp = data_[i];
        data_[i] = data_[j];
        data_[j] = tmp;
    }
}