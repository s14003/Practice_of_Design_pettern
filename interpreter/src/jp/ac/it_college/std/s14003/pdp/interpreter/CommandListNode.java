package jp.ac.it_college.std.s14003.pdp.interpreter;

import java.util.ArrayList;

/**
 * Created by s14003 on 15/06/18.
 * &it;command list> ::= &it;command> * end
 */
public class CommandListNode  extends  Node {
    private ArrayList list = new ArrayList();
    @Override
    public void perse(Context context) throws ParseException {
        while (true) {
            if (context.currentToken() == null) {
                throw new ParseException("Missing 'end'");
            } else if (context.currentToken().equals("end")) {
                context.skipToken("end");
                break;
            } else {
                Node commandNode = new CommandNode();
                commandNode.perse(context);
                list.add(commandNode);
            }
        }
    }
    @Override
    public String toString() {
        return list.toString();
    }
}
