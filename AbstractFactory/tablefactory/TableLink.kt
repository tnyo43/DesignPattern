package tablefactory;
import factory.*;

class TableLink(caption: String, url: String): Link(caption, url) {
    override public fun makeHTML(): String {
        return String.format("<td><a href=\"%s\">%s</a></td>", url, caption);
    }
}