package jp.ac.it_college.std.s14003.pdp.af.factory;

/**
 * Created by s14003 on 15/06/10.
 */
public abstract class Factory {
    public static Factory getFactory(Class cls) { //2段階に分けてる ↓
        Factory factory = null;
        try {
            factory = (Factory) cls.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            System.err.println(e.getMessage());
            e.printStackTrace(System.err);
            System.exit(1);
        }
        return factory;
    }

    public static Factory getFactory(String name) { //2段階に分けている ↑
        Factory factory = null;
        try {
            factory = getFactory(Class.forName(name));
        } catch (ClassNotFoundException e) {
            System.err.println(e.getMessage());
            e.printStackTrace(System.err);
            System.exit(1);
        }
        return factory;
    }
    public abstract Link createLink(String caption,String url);
    public abstract Tray createTray(String caption);
    public abstract Page createPage(String title,String author);
}
