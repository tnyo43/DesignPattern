public class QuickSorter<T: Comparable<T>>: Sorter<T>() {
    private lateinit var data_: Array<T>;

    override fun sort(data_: Array<T>) {
        this.data_ = data_;
        qsort(0, data_.size);
    }

    private fun qsort(left: Int, right: Int) {
        if (left + 1 >= right) return;
        val p: T = this.data_[left];
        var l = left+1;
        var r = right-1;
        do {
            while (l < right && this.data_[l] < p) l++;
            while (r > left && this.data_[r] >= p) r--;
            if (l < r) {
                swap(this.data_, l, r);
            }
        } while (l < r);
        swap(this.data_, left, l-1);
        qsort(left, l);
        qsort(l+1, right);
    }
}