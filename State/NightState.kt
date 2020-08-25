public class NightState: State {
    private constructor() {}

    companion object {
        private val singleton = NightState();

        public fun getInstance() = singleton;
    }

    override public fun doClock(context: Context, hour: Int) {
        if (12 <= hour && hour < 13) {
            context.changeState(LunchState.getInstance());
        } else if (9 <= hour && hour < 17) {
            context.changeState(DayState.getInstance());
        }
    }

    override public fun doUse(context: Context) {
        context.callSecurityCenter("非常：夜間の金庫使用！");
    }

    override public fun doAlarm(context: Context) {
        context.callSecurityCenter("非常ベル（夜間）");
        context.changeState(UrgentState.getInstance());
    }

    override public fun doPhone(context: Context) {
        context.recordLog("夜間の通話録音");
    }

    override public fun toString() = "（夜間）";
}