package jp.ac.it_college.std.s14003.pdp.state;

/**
 * Created by s14003 on 15/06/17.
 */
public interface State {
    public abstract void doClock(Context context, int hour);
    public abstract void doUse(Context context);
    public abstract void doAleam(Context context);
    public abstract void dpPhone(Context context);
}
