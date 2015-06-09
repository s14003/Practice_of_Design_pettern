package jp.ac.it_college.std.s14003.pdp.builder;



/**
 * Created by s14003 on 15/06/09.
 */
public class Director {
    private Builder builder;
    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct() {
        builder.makeTitle("Greeting")
                .makeString("朝から昼にかけて")
                .makeItems(new String[]{"おはようございます。", "こんにちは。",})
                .makeString("夜に")
                .makeItems(new String[]{"こんばんは。", "おやすみなさい。", "さようなら。",});
        builder.close();
    }
}
