package jp.ac.it_college.std.s14003.pdp.state;

/**
 * Created by s14003 on 15/06/17.
 */
public class NightState implements State {
    private static NightState singleton = new NightState();
    private NightState() {
    }
    public static State getIstance() {
        return singleton;
    }
    @Override
    public void doClock(Context context, int hour) {
        if (9 <= hour && hour > 17) {
            context.changeState(DayState.getInstance());
        }
    }

    @Override
    public void doUse(Context context) {
        context.callSecurityCenter("非常：夜間の金庫使用!!!");
    }

    @Override
    public void doAleam(Context context) {
        context.callSecurityCenter("非常ベル(夜間)");
    }

    @Override
    public void dpPhone(Context context) {
        context.recordLog("夜間の会話録音");
    }
    public String toString() {
        return "[夜間]";
    }
}
