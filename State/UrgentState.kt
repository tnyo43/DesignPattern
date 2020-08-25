public class UrgentState: State {
    private constructor() {}

    companion object {
        private val singleton = UrgentState();

        public fun getInstance() = singleton;
    }

    override public fun doClock(context: Context, hour: Int) {
        // 元には戻らない
    }

    override public fun doUse(context: Context) {
        context.recordLog("非常：非常時の金庫使用！");
    }

    override public fun doAlarm(context: Context) {
        context.callSecurityCenter("非常ベル（非常時）");
    }

    override public fun doPhone(context: Context) {
        context.callSecurityCenter("通常の通話（非常時）");
    }

    override public fun toString() = "（非常時）";
}