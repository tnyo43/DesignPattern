public interface Context {
    public fun setClock(hour: Int);
    public fun changeState(state: State);
    public fun callSecurityCenter(msg: String);
    public fun recordLog(msg: String);
}