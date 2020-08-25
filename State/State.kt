public interface State {
    public fun doClock(context: Context, hour: Int);
    public fun doUse(context: Context);
    public fun doAlarm(context: Context);
    public fun doPhone(context: Context);
}