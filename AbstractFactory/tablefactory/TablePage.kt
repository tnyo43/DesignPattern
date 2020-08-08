package tablefactory;
import factory.*;

class TablePage(title: String, author: String): Page(title, author) {
    override public fun makeHTML(): String {
        val buffer = StringBuffer();
        buffer.append(String.format("<html><head><title>%s</title></head>\n", title));
        buffer.append("<body>\n");
        buffer.append(String.format("<h1>%s</h1>\n", title));
        buffer.append("<table width=\"80\" border=\"3\">\n")
        content.forEach { buffer.append(String.format("<tr>%s</tr>", it.makeHTML())) };
        buffer.append("</table>\n");
        buffer.append(String.format("<hr><address>%s</address>\n", author));
        buffer.append("</body></html>\n");
        return buffer.toString();
    }
}