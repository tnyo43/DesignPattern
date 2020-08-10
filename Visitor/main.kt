fun main() {
    try {
        println("making root entries...");
        val root = Directory("root");
        val bin = Directory("bin");
        val tmp = Directory("tmp");
        val usr = Directory("usr");
        root.add(bin);
        root.add(tmp);
        root.add(usr);
        bin.add(File("vi", 10000));
        bin.add(File("latex", 100));
        root.accept(ListVisitor());
        println();

        println("making user entries");
        val yuki = Directory("yuki");
        val hanako = Directory("hanako");
        val tomo = Directory("tomo");
        usr.add(yuki);
        usr.add(hanako);
        usr.add(tomo);
        yuki.add(File("diary.html", 1000));
        yuki.add(File("main.kt", 10));
        hanako.add(File("memo.txt", 402));
        tomo.add(File("game.html", 12));
        val cat = File("cat.png", 12345432);
        tomo.add(cat);
        root.accept(ListVisitor());
        println();

        val v13_1 = FileVisitor(".html");
        root.accept(v13_1);
        println("HTML files are:");
        val it = v13_1.getFoundFiles();
        while (it.hasNext()) {
            val entry = it.next();
            println(entry);
        }
        println();

        val another_root = Directory("a_root");
        another_root.add(File("a.kt", 123));
        another_root.add(File("b.json", 4));

        val list = ElementArrayList();
        list.add(root);
        list.add(another_root);
        list.add(File("hugahuga.huga", 20));
        list.accept(ListVisitor());
    } catch (e: FileTreatmentException) {
        e.printStackTrace();
    }
}