package jp.ac.it_college.std.s14003.pdp.interpreter;

/**
 * Created by s14003 on 15/06/18.
 * &it;primitive command> ::= go | right | left
 */
public class PrimitiveCommandNode extends Node{
    private String name;
    @Override
    public void perse(Context context) throws ParseException {
        name = context.currentToken();
        context.skipToken(name);
        if (!name.equals("go") && !name.equals("right") && !name.equals("left")) {
            throw new ParseException(name + "is underfined");
        }
    }
    public String toString() {
        return name;
    }
}
