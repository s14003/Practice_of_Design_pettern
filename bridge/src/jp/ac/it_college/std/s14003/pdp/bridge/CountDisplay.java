package jp.ac.it_college.std.s14003.pdp.bridge;

/**
 * Created by s14003 on 15/06/10.
 */
public class CountDisplay extends Display {
    public CountDisplay(DisplayImpl imp1) {
        super(imp1);
    }

    public void multiDisplay(int times) {
        open();
        for (int i = 0;i < times;i++) {
            print();
        }
        close();
    }
}
