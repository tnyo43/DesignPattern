package idcard;

import framework.*;

class IDCard(owner: String, number: Int): Product() {
    private val owner: String;
    private val number: Int;

    init {
        this.owner = owner;
        this.number = number;
        println(this.owner + "(" + this.number + ")のカードを作ります");
    }

    override fun use() {
        println(this.owner + "(" + this.number + ")のカードを使います");
    }

    public fun getOwner(): String = owner;
}