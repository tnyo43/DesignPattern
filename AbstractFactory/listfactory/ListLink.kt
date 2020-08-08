package listfactory;
import factory.*;

public class ListLink(caption: String, url: String): Link(caption, url) {
    override public fun makeHTML(): String {
        return String.format("<li><a href=\"%s\">%s</a></li>\n", this.url, this.caption);
    }
}