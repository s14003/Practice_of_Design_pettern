package jp.ac.it_college.std.s14003.pdp.decorator;

/**
 * Created by s14003 on 15/06/11.
 */
public class SideBorder extends Border {
    private char borderChar;
    protected SideBorder(Display display, char ch) {
        super(display);
        this.borderChar = ch;
    }

    @Override
    public int getColomns() {
        return 1 + display.getColomns() + 1;
    }

    @Override
    public int getRows() {
        return display.getRows();
    }

    @Override
    public String getRowText(int row) {
        return borderChar + display.getRowText(row) + borderChar;
    }
}
