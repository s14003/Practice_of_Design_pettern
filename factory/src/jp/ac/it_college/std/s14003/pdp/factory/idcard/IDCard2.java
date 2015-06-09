package jp.ac.it_college.std.s14003.pdp.factory.idcard;

import jp.ac.it_college.std.s14003.pdp.factory.framework.Product;

/**
 * Created by s14003 on 15/06/04.
 */
public class IDCard2 extends Product {
    private String owner;
    private int number;

    IDCard2(String owner, int number) {
        System.out.println(owner + "(" + number + ")" + "のカードを作ります");
        this.owner = owner;
    }

    @Override
    public void use() {
        System.out.println(owner + "(" + number+ ")" +"のカードを使います");
    }

    public String getOwner() {
        return owner;
    }
}
