class Singleton {
    companion object {
        private var singleton: Singleton? = null;

        @Synchronized
        fun getInstance(): Singleton {
            if (singleton == null) {
                singleton = Singleton();
            }
            return singleton!!;
        }
    }

    private constructor() {
        println("create a instance");
        slowdown();
    }

    private fun slowdown() {
        try {
            Thread.sleep(1000);
        } catch (e: InterruptedException) {
        }
    }
}