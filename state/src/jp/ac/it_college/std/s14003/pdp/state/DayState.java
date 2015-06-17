package jp.ac.it_college.std.s14003.pdp.state;

/**
 * Created by s14003 on 15/06/17.
 */
public class DayState implements State {
    private static DayState singleton = new DayState();
    private DayState() {
    }
    public static State getInstance() {
        return singleton;
    }
    @Override
    public void doClock(Context context, int hour) {
        if (hour < 9 || 17 <= hour) {
            context.changeState(NightState.getIstance());
        }
    }

    @Override
    public void doUse(Context context) {
        context.recordLog("金庫使用(昼間)");
    }

    @Override
    public void doAleam(Context context) {
        context.callSecurityCenter("非常ベル(昼間)");
    }

    @Override
    public void dpPhone(Context context) {
        context.callSecurityCenter("通常電話(夜間)");
    }

    public String toString() {
        return "[昼間]";
    }
}
