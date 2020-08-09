fun main(args: Array<String>) {
    if (args.size != 2) {
        println("usage: kotlin MainKt randomseed1 randomseed2");
        println("example: kotln MainKt 314 15");
        return;
    }

    val seed1 = args[0].toLong();
    val p1 = Player("Taro", WinningStrategy(seed1));
    val seed2 = args[1].toLong();
    val p2 = Player("Hana", ProbStrategy(seed2));

    for (i in 1..100000) {
        val next1 = p1.nextHand();
        val next2 = p2.nextHand();

        if (next1.isStrongerThan(next2)) {
            println("winner: " + p1);
            p1.win();
            p2.lose();
        } else if (next1.isWeakerThan(next2)) {
            println("winner: " + p2);
            p1.lose();
            p2.win();
        } else {
            println("even");
            p1.even();
            p2.even();
        }
    }

    println("total score");
    println(p1);
    println(p2);
}