import java.io.*;
import game.*;

val SAVE_FILENAME = "game.dat";

fun saveMemento(memento: Memento) {
    try {
        val out = ObjectOutputStream(FileOutputStream(SAVE_FILENAME));
        out.writeObject(memento);
        out.close();
    } catch (e: IOException) {
        e.printStackTrace();
    }
}

fun loadMemento(gamer: Gamer): Memento {
    var memento: Memento? = null;
    try {
        val oin = ObjectInputStream(FileInputStream(SAVE_FILENAME));
        memento = oin.readObject() as Memento;
        oin.close();
    } catch (e: FileNotFoundException) {
        println(e.toString());
    } catch (e: IOException) {
        e.printStackTrace();
    } catch (e: ClassNotFoundException) {
        e.printStackTrace();
    }

    val result = memento;
    if (result == null) {
        println("新規にスタートします");
        return gamer.createMemento();
    } else {
        println("前回保存した結果からスタートします");
        gamer.restoreMemento(result);
        return result;
    }
}

fun main() {

    val gamer = Gamer(100);
    var memento = loadMemento(gamer);

    for (i in 1..100) {
        println(String.format("=== %d", i));
        println(String.format("現状: %s", gamer));

        gamer.bet();

        println(String.format("所持金は %d 円になりました", gamer.getMoney()));

        if (gamer.getMoney() > memento.getMoney_()) {
            println("     (だいぶ増えたので、現在の状態を保存しておこう)");
            memento = gamer.createMemento();
            saveMemento(memento);
        } else if (gamer.getMoney() < memento.getMoney_() / 2) {
            println("     (だいぶ減ったので、以前の状態に復帰しよう )");
            gamer.restoreMemento(memento);
        }

        try {
            Thread.sleep(1000);
        } catch (e: Exception) {
        }
        println();
    }
}
