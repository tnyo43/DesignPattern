public class SelectionSorter<T: Comparable<T>>: Sorter<T>() {
    override fun sort(data_: Array<T>) {
        for (i in 0..(data_.size-1)) {
            var minIdx = i;
            for (j in (i+1)..(data_.size-1)) {
                if (data_[j] < data_[i]) {
                    minIdx = j;
                }
            }
            swap(data_, minIdx, i);
        }
    }
}