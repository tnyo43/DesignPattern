public class ElementArrayList: ArrayList<Element>, Element {
    constructor(): super() {
    }

    override public fun accept(visitor: Visitor) {
        val it = iterator();
        while (it.hasNext()) {
            val e = it.next();
            e.accept(visitor);
        }
    }
}