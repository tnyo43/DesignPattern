package factory;
import java.io.*;
import java.util.ArrayList;

public abstract class Page(title: String, author: String): HTMLable {
    protected val title: String;
    protected val author: String;
    protected val content = ArrayList<Item>();

    init {
        this.title = title;
        this.author = author
    }

    public fun add(item: Item) {
        content.add(item);
    }

    public fun output() {
        try {
            val filename = title + ".html";
            val writer: Writer = FileWriter(filename);
            writer.write(this.makeHTML());
            writer.close();
            println(filename + "を作成しました");
        } catch (e: IOException) {
            e.printStackTrace();
        }
    }
}