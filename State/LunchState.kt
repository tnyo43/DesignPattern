public class LunchState: State {
    private constructor() {}

    companion object {
        private val singleton = LunchState();

        public fun getInstance() = singleton;
    }

    override public fun doClock(context: Context, hour: Int) {
        if (9 <= hour && hour < 12 || 13 <= hour && hour < 17) {
            context.changeState(DayState.getInstance());
        } else if (hour < 9 || 17 <= hour) {
            context.changeState(NightState.getInstance());
        }
    }

    override public fun doUse(context: Context) {
        context.recordLog("非常：昼食時の金庫使用！");
    }

    override public fun doAlarm(context: Context) {
        context.callSecurityCenter("非常ベル（昼食時）");
        context.changeState(UrgentState.getInstance());
    }

    override public fun doPhone(context: Context) {
        context.recordLog("昼食時の通話録音");
    }

    override public fun toString() = "（昼食時）";
}