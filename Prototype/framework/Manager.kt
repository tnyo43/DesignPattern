package framework;

class Manager {
    private val showcase = HashMap<String, Product>();

    fun register(name: String, proto: Product) {
        showcase.put(name, proto);
    }

    fun create(name: String): Product {
        val p = showcase.get(name);
        if (p == null) {
            throw Exception();
        } else {
            return p.createClone();
        }   
    }
}