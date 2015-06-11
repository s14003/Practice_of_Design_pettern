package jp.ac.it_college.std.s14003.pdp.decorator;

/**
 * Created by s14003 on 15/06/11.
 */
public class FullBorder extends Border {

    protected FullBorder(Display display) {
        super(display);
    }

    @Override
    public int getColomns() {
        return 1 + display.getColomns() + 1;
    }

    @Override
    public int getRows() {
        return 1 + display.getRows() + 1;
    }

    @Override
    public String getRowText(int row) {
        if (row == 0 ) {
            return "+" + makeLine('-', display.getColomns()) + "+";
        } else if (row == display.getRows() + 1) {
            return "+" + makeLine('-', display.getColomns()) + "+";
        } else {
            return "|" + display.getRowText(row - 1) + "|";
        }
    }
    private String makeLine(char ch, int count) {
        StringBuffer buf = new StringBuffer();
        for (int i = 0;i < count;i++) {
            buf.append(ch);
        }
        return buf.toString();
    }
}
