public class BigCharFactory {
    private val pool: HashMap<Char, BigChar>;

    companion object {
        private val singleton = BigCharFactory();
        
        public fun getInstance() = singleton;
    }

    private constructor() {
        pool = HashMap();
    }

    @Synchronized
    public fun getBigChar(charname: Char): BigChar {
        val bc = pool.get(charname);
        if (bc == null) {
            val newbc = BigChar(charname);
            pool.put(charname, newbc);
            return newbc;
        } else {
            return bc;
        }
    }
}