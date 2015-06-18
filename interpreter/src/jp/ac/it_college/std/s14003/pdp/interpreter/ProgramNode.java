package jp.ac.it_college.std.s14003.pdp.interpreter;

/**
 * Created by s14003 on 15/06/18.
 * <program> :: program <command list>
 */
public class ProgramNode  extends Node {
    private Node commandListNode;
    @Override
    public void perse(Context context) throws ParseException {
        context.skipToken("program");
        commandListNode = new CommandListNode();
        commandListNode.perse(context);
    }
    public String toString() {
        return "[program " + commandListNode + "]";
    }
}
