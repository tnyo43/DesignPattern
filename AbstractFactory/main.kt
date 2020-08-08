import factory.*;
import listfactory.*;

fun main(args: Array<String>) {
    if (args.size != 1) {
        println("usage: kotlin MainKt classname.of.ConcreateFactory");
        println("example 1: kotlin MainKt listfactory.ListFactory");
        println("example 2: kotlin MainKt tablefactory.TableFactory");
        return;
    }

    val factory = Factory.getFactory(args[0]);

    val asahi = factory.createLink("朝日新聞", "http://www.asahi.com");
    val yomiuri = factory.createLink("読売新聞", "http://www.yomiuri.co.jp");

    val us_yahoo = factory.createLink("Yahoo!", "http://www.yahoo.com");
    val jp_yahoo = factory.createLink("Yahoo!Japan", "http://www.yahoo.co.jp");
    val excite = factory.createLink("Excite", "http://www.excite.com");
    val google = factory.createLink("Google", "http://www.google.com");

    val trayNews = factory.createTray("新聞");
    trayNews.add(asahi);
    trayNews.add(yomiuri);

    val trayYahoo = factory.createTray("Yahoo");
    trayYahoo.add(us_yahoo);
    trayYahoo.add(jp_yahoo);

    val traySearch = factory.createTray("検索エンジン");
    traySearch.add(trayYahoo);
    traySearch.add(excite);
    traySearch.add(google);

    val page = factory.createPage("LinkPage", "ともとも");
    page.add(trayNews);
    page.add(traySearch);
    page.output();

    factory.createYahooPage("ともとも");
}