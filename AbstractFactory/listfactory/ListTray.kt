package listfactory;
import factory.*;

public class ListTray(caption: String): Tray(caption) {
    override public fun makeHTML(): String {
        val buffer = StringBuffer();
        buffer.append("<li>\n");
        buffer.append(caption + "\n");
        buffer.append("<ul>\n");
        tray.forEach { buffer.append(it.makeHTML()) };
        buffer.append("</ul>\n");
        buffer.append("</li>\n");
        return buffer.toString();
    }
}