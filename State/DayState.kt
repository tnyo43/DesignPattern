public class DayState: State {
    private constructor() {}

    companion object {
        private val singleton = DayState();

        public fun getInstance() = singleton;
    }

    override public fun doClock(context: Context, hour: Int) {
        if (12 <= hour && hour < 13) {
            context.changeState(LunchState.getInstance());
        } else if (hour < 9 || 17 <= hour) {
            context.changeState(NightState.getInstance());
        }
    }

    override public fun doUse(context: Context) {
        context.recordLog("金庫使用（昼間）");
    }

    override public fun doAlarm(context: Context) {
        context.callSecurityCenter("非常ベル（昼間）");
        context.changeState(UrgentState.getInstance());
    }

    override public fun doPhone(context: Context) {
        context.callSecurityCenter("通常の通話（昼間）");
    }

    override public fun toString() = "（昼間）";
}