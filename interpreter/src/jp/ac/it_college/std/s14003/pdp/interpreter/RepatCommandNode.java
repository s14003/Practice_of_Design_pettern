package jp.ac.it_college.std.s14003.pdp.interpreter;

/**
 * Created by s14003 on 15/06/18.
 * &it;repeat command> ::= repeat &it;number> &it;command List>
 */
public class RepatCommandNode extends Node {
    private int number;
    private Node commandListNode;
    @Override
    public void perse(Context context) throws ParseException {
        context.skipToken("repeat");
        number = context.currentNumber();
        context.nextToken();
        commandListNode = new CommandListNode();
        commandListNode.perse(context);
    }
    public String toString() {
        return "[repeat" + number + " " + commandListNode + "]";
    }
}
