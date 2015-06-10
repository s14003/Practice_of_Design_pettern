package jp.ac.it_college.std.s14003.pdp.af.listfactory;

import jp.ac.it_college.std.s14003.pdp.af.factory.Page;
import jp.ac.it_college.std.s14003.pdp.af.factory.Item;

import java.util.Iterator;

/**
 * Created by s14003 on 15/06/10.
 */
public class ListPage extends Page {
    public ListPage(String title, String author) {
        super(title, author);
    }

    @Override
    public String makeHTML() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("<html><head><title>")
                .append(title)
                .append("</title></head>")
                .append('\n')
                .append("<body>")
                .append('\n')
                .append("<ul>")
                .append('\n');
        Iterator it = content.iterator();
        while (it.hasNext()) {
            Item item = (Item)it.next();
            buffer.append(item.makeHTML());
        }
        buffer.append("</ul>")
                .append('\n')
                .append("<hr><address>")
                .append(author)
                .append("</address></hr>")
                .append("</body></html>")
                .append('\n');
        return buffer.toString();
    }
}
