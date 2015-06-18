package jp.ac.it_college.std.s14003.pdp.interpreter;

/**
 * Created by s14003 on 15/06/18.
 * &it;command> ::= &it;repeat command> | &it;primitive command>
 */
public class CommandNode  extends Node{
    private Node node;

    @Override
    public void perse(Context context) throws ParseException {
        if (context.currentToken().equals("repeat")) {
            node = new RepatCommandNode();
            node.perse(context);
        } else {
            node = new PrimitiveCommandNode();
            node.perse(context);
        }
    }
    public String toString() {
        return node.toString();
    }
}
