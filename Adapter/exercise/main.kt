import java.io.IOException;

fun main() {
    val f: FileIO = FileProperties();
    try {
        f.readFromFile("file.txt");
        f.setValue("year", "2020");
        f.setValue("month", "8");
        f.setValue("day", "4");
        f.writeToFile("newFile.txt");
    } catch (e: IOException) {
        e.printStackTrace();
    }
}