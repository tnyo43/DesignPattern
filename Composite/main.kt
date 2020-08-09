fun main() {
    try {
        println("making root entry");
        val root = Directory("root");
        val bin = Directory("bin");
        val tmp = Directory("tmp");
        val usr = Directory("usr");
        root.add(bin);
        root.add(tmp);
        root.add(usr);
        bin.add(File("vi", 10000));
        bin.add(File("latex", 100));
        root.printList();
        println();

        println("making usr entry");
        val yuki = Directory("yuki");
        val hanako = Directory("hanako");
        val tomo = Directory("tomo");
        usr.add(yuki);
        usr.add(hanako);
        usr.add(tomo);
        yuki.add(File("diary.html", 1000));
        yuki.add(File("main.kt", 10));
        hanako.add(File("memo.txt", 402));
        tomo.add(File("game.doc", 12));
        val cat = File("cat.png", 12345432);
        tomo.add(cat);
        root.printList();

        println("cat : " + cat.getFullPath());
    } catch (e: FileTreatmentException) {
        e.printStackTrace();
    }
}