package tablefactory;
import factory.*;

class TableTray(caption: String): Tray(caption) {
    override public fun makeHTML(): String {
        val buffer = StringBuffer();
        buffer.append("<td>\n");
        buffer.append("<table width=\"100%\" border=\"1\"><tr>")
        buffer.append(
            String.format(
                "<td bgcolor=\"#cccccc\" align=\"center\" colspan=\"%s\"><b>%s</b></td>\n",
                tray.size,
                caption
            )
        );
        buffer.append("</tr>\n");
        buffer.append("<tr>\n");
        tray.forEach { buffer.append(it.makeHTML()) };
        buffer.append("</tr></table>\n");
        buffer.append("</td>\n");
        return buffer.toString();
    }
}