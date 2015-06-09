package jp.ac.it_college.std.s14003.pdp.template;

/**
 * Created by s14003 on 15/06/04.
 */
public class CharDisplay extends AbstractDisplay {
    private char ch;
    public CharDisplay(char ch) {
        this.ch = ch;
    }
    @Override
    public void open() {
        System.out.print("<<");
    }
    @Override
    public void print() {
        System.out.print(ch);
    }
    @Override
    public void close() {
        System.out.println(">>");
    }
}
