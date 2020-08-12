public abstract class Support(name: String) {
    private val name: String;
    private var next: Support? = null;

    init {
        this.name = name;
    }

    public fun setNext(next: Support): Support {
        this.next = next;
        return next;
    }

    public fun support(trouble: Trouble) {
        val nxt = next;
        if (resolve(trouble)) {
            done(trouble);
        } else if (nxt != null) {
            nxt.support(trouble);
        } else {
            fail(trouble);
        }
    }

    /*
    // for state version
    public fun support(trouble: Trouble) {
        var support = this;
        while (true) {
            if (support.resolve(trouble)) {
                support.done(trouble);
                break;
            } else if (support.next == null) {
                fail(trouble);
                break;
            }
            support = support.next!!;
        }
    }
    */

    protected abstract fun resolve(trouble: Trouble): Boolean;

    protected fun done(trouble: Trouble) {
        println(String.format("%s is resolved by %s.", trouble, this));
    }

    protected fun fail(trouble: Trouble) {
        println(String.format("%s cannot be resolved", trouble));
    }

    override public fun toString(): String {
        return String.format("[%s]", name);
    }
}