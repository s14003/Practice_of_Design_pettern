package jp.ac.it_college.std.s14003.pdp.factory.idcard;

import jp.ac.it_college.std.s14003.pdp.factory.framework.Product;

/**
 * Created by s14003 on 15/06/04.
 */
public class IDCard extends Product {
    private String owner;

    IDCard(String owner) {
        System.out.println(owner + "のカードを作ります");
        this.owner = owner;
    }

    @Override
    public void use() {
        System.out.println(owner + "のカードを使います");
    }

    public String getOwner() {
        return owner;
    }

}
