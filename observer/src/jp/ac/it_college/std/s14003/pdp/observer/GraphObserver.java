package jp.ac.it_college.std.s14003.pdp.observer;

/**
 * Created by s14003 on 15/06/16.
 */
public class GraphObserver implements Observer {
    @Override
    public void update(NumberGenerator generator) {
        System.out.println("GraphObserver");
        int count = generator.getNumber();
        for (int i = 0;i < count;i++) {
            System.out.print("*");
        }
        System.out.println("");
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
        }
    }
}
