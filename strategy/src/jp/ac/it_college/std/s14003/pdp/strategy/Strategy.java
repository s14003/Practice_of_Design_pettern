package jp.ac.it_college.std.s14003.pdp.strategy;

/**
 * Created by s14003 on 15/06/10.
 */
public interface Strategy {
    public abstract Hand nextHand();
    void study(boolean win);
}
