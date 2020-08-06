package framework;

// interfaceだと java.lang.NoClassDefFoundError が出るので抽象classにした
abstract class Product: Cloneable {
    abstract fun use(s: String);

    fun createClone(): Product {
        try {
            return clone() as Product;
        } catch (e: CloneNotSupportedException) {
            throw e;
        }
    }
}