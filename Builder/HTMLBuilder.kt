import java.io.*;

class HTMLBuilder: Builder() {
    private lateinit var filename: String;
    private lateinit var writer: PrintWriter;

    protected override fun buildTitle(title: String) {
        filename = title + ".html";
        try {
            writer = PrintWriter(FileWriter(filename));
        } catch (e: IOException) {
            e.printStackTrace();
        }

        writer.println("<html><head><title>" + title + "</title></head><body>");
        writer.println("<h1>" + title + "</h1>");
    }

    protected override fun buildString(str: String) {
        writer.println("<p>" + str + "</p>");
    }

    protected override fun buildItems(items: List<String>) {
        writer.println("<ul>");
        items.forEach {
            writer.println("<li>" + it + "</li>");
        };
        writer.println("</ul>");
    }

    protected override fun buildDone() {
        writer.println("</body></html>");
        writer.close();
    }

    public fun getFilename(): String {
        return filename;
    }
}