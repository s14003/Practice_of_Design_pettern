package jp.ac.it_college.std.s14003.pdp.proxy;

/**
 * Created by s14003 on 15/06/18.
 */
public class Printer implements Printable {
    private String name;
    public Printer() {
        heavyjob("Printerのインスタンスを生成中");
    }
    public  Printer(String name) {
        this.name = name;
        heavyjob("Printerのインスタンス(" + name + ")を生成中");
    }

    public void setPrinterName(String name) {
        this.name = name;
    }

    public String getPrinterName() {
        return name;
    }

    public void print (String string) {
        System.out.println("===" + name + "===");
        System.out.println(string);
    }

    public void heavyjob(String msg) {
        System.out.println(msg);
        for (int i = 0;i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            System.out.print(".");
        }
        System.out.println("完了。");
    }

}
