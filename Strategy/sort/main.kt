fun main() {
    val data1 = arrayOf("Dumpy", "Bowman", "Carroll", "Elfland", "Alice");
    SortAndPrint<String>(data1, SelectionSorter<String>()).execute();

    val data2 = arrayOf(5,4,3,7,9,11,2,4,7,-1,4,7,3,8,10);
    SortAndPrint<Int>(data2, QuickSorter<Int>()).execute();
}