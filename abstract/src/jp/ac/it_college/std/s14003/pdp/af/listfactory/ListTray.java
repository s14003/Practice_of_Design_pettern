package jp.ac.it_college.std.s14003.pdp.af.listfactory;

import jp.ac.it_college.std.s14003.pdp.af.factory.Tray;
import jp.ac.it_college.std.s14003.pdp.af.factory.Item;

import java.util.Iterator;

/**
 * Created by s14003 on 15/06/10.
 */
public class ListTray extends Tray {
    public ListTray(String caption) {
        super(caption);
    }

    @Override
    public String makeHTML() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("<li>\n")
                .append(caption )
                .append('\n')
                .append("<ul>")
                .append('\n');
        Iterator it = tray.iterator();
        while(it.hasNext()) {
            Item item = (Item)it.next();
            buffer.append(item.makeHTML());
        }
        buffer.append("</ul>")
                .append('\n')
                .append("</li>")
                .append('\n');
        return buffer.toString();
    }
}
