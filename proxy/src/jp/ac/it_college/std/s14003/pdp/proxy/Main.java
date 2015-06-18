package jp.ac.it_college.std.s14003.pdp.proxy;

/**
 * Created by s14003 on 15/06/18.
 */
public class Main {
    public static void main(String...args) {
        Printable p = new PrinterProxy("Alice");
        System.out.println("名前は現在" + p.getPrinterName() + "です。");
        p.setPrinterName("Bob");
        System.out.println("名前は現在" + p.getPrinterName() + "です。");
        p.print("Hello World.");
    }
}
