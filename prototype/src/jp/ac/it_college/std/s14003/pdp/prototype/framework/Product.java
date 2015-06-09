package jp.ac.it_college.std.s14003.pdp.prototype.framework;

/**
 * Created by s14003 on 15/06/04.
 */
public interface Product extends Cloneable {
    void use(String s);
    Product createClone();
}
