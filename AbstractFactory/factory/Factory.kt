package factory;

abstract class Factory {
    companion object {
        public fun getFactory(classname: String): Factory {
            try {
                val kclass = Class.forName(classname).kotlin;
                return kclass.constructors.first().call() as Factory;
            } catch (e: ClassNotFoundException) {
                println("クラス " + classname + " がみつかりません");
                throw e;
            } catch (e: Exception) {
                throw e;
            }
        }
    }

    public abstract fun createLink(caption: String, url: String): Link;
    public abstract fun createTray(caption: String): Tray;
    public abstract fun createPage(title: String, author: String): Page;

    public fun createYahooPage(author: String) {
        val link = createLink("Yahoo!", "https://www.yahoo.com");
        val page = createPage("Yahoo!", author);
        page.add(link);
        page.output();
    }
}