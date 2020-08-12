fun main() {
    val alice: Support = NoSupport("Alice");
    val bob: Support = LimitSupport("Bob", 100);
    val chris: Support = SpecialSupport("Chris", 429);
    val diana: Support = LimitSupport("Diana", 200);
    val elmo: Support = OddSupport("Elmo");
    val fred: Support = LimitSupport("Fred", 300);

    alice.setNext(bob).setNext(chris).setNext(diana).setNext(elmo).setNext(fred);
    for (i in 1..500) alice.support(Trouble(i));
}