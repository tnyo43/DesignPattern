package game;
import java.util.Random;

public class Gamer(money: Int) {
    private var money: Int;
    private var fruits: MutableList<String>;
    private val random: Random;

    companion object {
        private val fruitsname = listOf( "りんご", "ブドウ", "バナナ", "みかん" );
    }

    init {
        this.money = money;
        this.fruits = ArrayList<String>();
        this.random = Random();
    }

    public fun getMoney() = this.money;

    public fun bet() {
        val dice = random.nextInt(6) + 1;
        if (dice == 1) {
            money += 100;
            println("所持金が増えました");
        } else if (dice == 2) {
            money /= 2;
            println("所持金が半減しました");
        } else if (dice == 6) {
            val f = getFruit();
            println(String.format("フルーツ（%s）をもらいました", f));
            this.fruits.add(f);
        } else {
            println("何もおこりませんでした");
        }
    }

    public fun createMemento(): Memento {
        val m: Memento = Memento(money);
        val it: Iterator<String> = fruits.iterator();
        while (it.hasNext()) {
            val f = it.next();
            if (f.startsWith("おいしい")) {
                m.addFruit(f);
            }
        }
        return m;
    }

    public fun restoreMemento(memento: Memento) {
        this.money = memento.money;
        this.fruits = memento.getFruits();
    }

    override public fun toString() =
        String.format("[money = %d, fruits = %s]", this.money, this.fruits);

    private fun getFruit() =
            (if (random.nextBoolean()) "おいしい" else "") + Gamer.fruitsname[random.nextInt(Gamer.fruitsname.size)];
}