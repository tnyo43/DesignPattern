package tablefactory;
import factory.*;

public class TableFactory: Factory() {
    override public fun createLink(caption: String, url: String): Link {
        return TableLink(caption, url);
    }

    override public fun createTray(caption: String): Tray {
        return TableTray(caption);
    }

    override public fun createPage(title: String, author: String): Page {
        return TablePage(title, author);
    }
}