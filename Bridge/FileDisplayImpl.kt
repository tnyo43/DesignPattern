import java.io.*;

public class FileDisplayImpl(filename: String): DisplayImpl() {
    private val filename: String;
    private lateinit var reader: BufferedReader;

    private val MAX_READAHEAD_LIMIT = 4096;

    init {
        this.filename = filename;
    }

    override public fun rawOpen() {
        try {
            reader = BufferedReader(FileReader(filename));
            reader.mark(MAX_READAHEAD_LIMIT);
        } catch (e: IOException) {
            e.printStackTrace();
        }

        println(String.format("=-=-=-=-=-=-= %s =-=-=-=-=-=-=", filename));
    }

    override public fun rawPrint() {
        try {
            reader.reset();
            var line: String?;
            while (true) {
                line = reader.readLine();
                if (line == null) {
                    break;
                } else {
                    println(String.format("> %s", line));
                }
            }

            // "Stream closed" at second display
            // reader.readLine().forEach { println(String.format("> %s", it)) }
        } catch (e: IOException) {
            e.printStackTrace();
        }
    }

    override public fun rawClose() {
        try {
            reader.close();
        } catch (e: IOException) {
            e.printStackTrace();
        }
        println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
    }
}