import framework.*;
import idcard.*;

fun main() {
    val factory: Factory = IDCardFactory();
    val card1: Product = factory.createProduct("ともとも");
    val card2: Product = factory.createProduct("ジョージ");
    val card3: Product = factory.createProduct("マイク");
    card1.use();
    card2.use();
    card3.use();
}