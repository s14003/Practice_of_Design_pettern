package jp.ac.it_college.std.s14003.pdp.prototype;

import jp.ac.it_college.std.s14003.pdp.prototype.framework.Product;

import java.io.UnsupportedEncodingException;

/**
 * Created by s14003 on 15/06/04.
 */
public class UnderlinePen implements Product {
    private char unchar;
    public  UnderlinePen(char unchar) {
        this.unchar = unchar;
    }

    @Override
    public void use(String s) {
        int length = s.getBytes().length;

        System.out.println("\"" + s +"\"");
        System.out.print(" ");

        try {
            length = s.getBytes("MS932").length;
        } catch (UnsupportedEncodingException e) {
            System.out.println("サポートされていない文字コードです");
        }
        for (int i = 0;i < length;i++) {
            System.out.print(unchar);
        }
        System.out.println("");

        System.out.println(unchar + " " + s + " " + unchar);
        for (int i = 0;i < length;i++) {
            System.out.print(unchar);
        }
        System.out.println("");
    }

    public Product createClone() {
        Product p = null;
        try {
            p = (Product)clone();
        } catch (CloneNotSupportedException e) {
            System.err.println("cloneがサポートされていないクラスです");
            System.err.println(e.getStackTrace());
        }
        return p;
    }

}
