package listfactory;
import factory.*;

public class ListFactory: Factory() {
    override public fun createLink(caption: String, url: String): Link {
        return ListLink(caption, url);
    }

    override public fun createTray(caption: String): Tray {
        return ListTray(caption);
    }

    override public fun createPage(title: String, author: String): Page {
        return ListPage(title, author);
    }
}