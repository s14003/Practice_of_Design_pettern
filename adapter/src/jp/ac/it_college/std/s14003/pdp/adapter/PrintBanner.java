package jp.ac.it_college.std.s14003.pdp.adapter;

/**
 * Created by s14003 on 15/06/03.
 */
public class PrintBanner extends Banner implements Print {
    public PrintBanner(String string) {
        super(string);
    }

    @Override
    public void printWeak() {
        showWithParen();
    }

    @Override
    public void printStrong() {
        showWithAster();
    }
}
