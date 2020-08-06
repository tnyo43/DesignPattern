package idcard;

import framework.*;
import java.util.*;

class IDCardFactory: Factory() {
    private val owners: MutableList<String> = ArrayList<String>();
    private var number: Int = 0;

    override fun createProduct(owner: String): Product {
        return IDCard(owner, number++);
    }

    override fun registerProduct(prod: Product) {
        owners.add((prod as IDCard).getOwner());
    }
}