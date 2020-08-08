fun usage() {
    println("usage: kotlin MainKt plain");
    println("usage: kotlin MainKt html");
}

fun main(args: Array<String>) {
    if (args.size != 1) {
        usage();
        return;
    }

    if (args[0] == "plain") {
        val textBuilder = TextBuilder();
        val director = Director(textBuilder);
        director.construct();
        val result = textBuilder.getResult();
        println(result);
    } else if (args[0] == "html") {
        val htmlBuilder = HTMLBuilder();
        val director = Director(htmlBuilder);
        director.construct();
        val filename = htmlBuilder.getFilename();
        println(filename + "が作成されました");
    } else {
        usage();
    }
}