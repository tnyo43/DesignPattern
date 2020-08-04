import java.io.*;
import java.util.Properties;

class FileProperties: FileIO {
    val p = Properties();

    @Throws(IOException::class)
    override fun readFromFile(filename: String) {
        p.load(FileInputStream(filename));
    }

    @Throws(IOException::class)
    override fun writeToFile(filename: String) {
        p.store(FileOutputStream(filename), "written by FileProperty");
    }

    override fun setValue(key: String, value: String) {
        p.setProperty(key, value);
    }

    override fun getValue(key: String): String {
        return p.getProperty(key);
    }
}