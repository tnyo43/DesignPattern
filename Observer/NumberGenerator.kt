public abstract class NumberGenerator {
    private val observers: ArrayList<Observer>;

    init {
        observers = ArrayList();
    }

    public fun addObserver(observer: Observer) {
        observers.add(observer);
    }

    public fun deleteObserver(observer: Observer) {
        observers.remove(observer);
    }

    public fun notifyObservers() {
        val it: Iterator<Observer> = observers.iterator();
        while (it.hasNext()) {
            val o = it.next();
            o.update(this);
        }
    }

    public abstract fun getNumber(): Int;
    public abstract fun execute();
}