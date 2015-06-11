package jp.ac.it_college.std.s14003.pdp.decorator;

/**
 * Created by s14003 on 15/06/11.
 */
public class Main {
    public static void main(String[] args) {
        Display d1 = new StringDisplay("Hello World.");
        Display d2 = new SideBorder(d1, '#');
        Display d3 = new FullBorder(d2);
        d1.show();
        d2.show();
        d3.show();
        Display d4 =
                new SideBorder(
                        new FullBorder(
                                new FullBorder(
                                        new SideBorder(
                                                new FullBorder(
                                                        new StringDisplay("こんにちは。")
                                                ),
                                                '*'
                                        )
                                )
                        ),
                        '/'
                );
        d4.show();
    }
}
