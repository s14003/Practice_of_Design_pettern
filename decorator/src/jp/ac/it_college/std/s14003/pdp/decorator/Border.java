package jp.ac.it_college.std.s14003.pdp.decorator;

/**
 * Created by s14003 on 15/06/11.
 */
public abstract class Border extends Display {
    protected Display display;
    protected Border (Display display) {
        this.display = display;
    }
}
