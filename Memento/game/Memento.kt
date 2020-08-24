package game;

import java.io.Serializable;

public class Memento(money: Int): Serializable {
    val money: Int;
    internal val fruits: ArrayList<String>;

    init {
        this.money = money;
        this.fruits = ArrayList();
    }

    public fun getMoney_(): Int = money;

    fun addFruit(fruit: String) {
        this.fruits.add(fruit);
    }

    fun getFruits(): MutableList<String> = this.fruits.subList(0, this.fruits.size);
}