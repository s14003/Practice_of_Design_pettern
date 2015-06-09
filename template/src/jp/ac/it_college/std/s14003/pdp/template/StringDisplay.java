package jp.ac.it_college.std.s14003.pdp.template;

import java.io.UnsupportedEncodingException;

/**
 * Created by s14003 on 15/06/04.
 */

public class StringDisplay extends AbstractDisplay {
    private String string;
    private int width;
    public StringDisplay(String string) {
        this.string = string;
        try {
            this.width = string.getBytes("MS932").length;
        } catch (UnsupportedEncodingException e){
            System.err.println("未対応の文字コードです");
            System.exit(1);
        }

    }
    @Override
    public void open() {
        printLine();
    }
    @Override
    public void print() {
        System.out.println("|" + string + "|");
    }
    @Override
    public void close(){
        printLine();
    }

    private void printLine() {
        System.out.print("+");

        for (int i = 0;i < width;i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }
}
