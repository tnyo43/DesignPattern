import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BigChar {
    private val charname: Char;
    private val fontdata: String;

    constructor(charname: Char) {
        this.charname = charname;

        var readResult: String;
        try {
            val reader = BufferedReader(FileReader(String.format("numbers/big%c.txt", charname)));
            val buf = StringBuffer();
            var line: String?;
            while (true) {
                line = reader.readLine();
                if (line == null) {
                    break;
                }
                buf.append(line);
                buf.append("\n");
            }
            reader.close();
            readResult = buf.toString();
        } catch (e: IOException) {
            readResult = charname + "?";
        }
        this.fontdata = readResult;
    }

    public fun print() {
        print(fontdata);
    }
}