package listfactory;
import factory.*;

public class ListPage(title: String, author: String): Page(title, author) {
    override public fun makeHTML(): String {
        val buffer = StringBuffer();
        buffer.append(String.format("<html><head><title>%s</title></head>\n", title));
        buffer.append("<body>\n");
        buffer.append(String.format("<h1>%s</h1>\n", title));
        buffer.append("<ul>\n");
        content.forEach { buffer.append(it.makeHTML()) };
        buffer.append("</ul>\n");
        buffer.append(String.format("<hr><address>%s</address>\n", author));
        buffer.append("</body></html>\n");
        return buffer.toString();
    }
}