package jp.ac.it_college.std.s14003.pdp.prototype;

import jp.ac.it_college.std.s14003.pdp.prototype.framework.Product;

import java.io.UnsupportedEncodingException;


/**
 * Created by s14003 on 15/06/04.
 */
public class MessageBox  implements Product{
    private char docochar;
    public MessageBox(char docochar) {
        this.docochar = docochar;
    }
    @Override
    public void use(String s) {
        int length = 0;
        try {
            length = s.getBytes("MS932").length;
        } catch (UnsupportedEncodingException e) {
            System.out.println("サポートされていない文字コードです");
        }
        for (int i = 0;i < length;i++) {
            System.out.print(docochar);
        }
        System.out.println("");

        System.out.println(docochar + " " + s + " " + docochar);
        for (int i = 0;i < length;i++) {
            System.out.print(docochar);
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
