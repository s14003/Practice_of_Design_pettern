package jp.ac.it_college.std.s14003.pdp.command.drawer;

import jp.ac.it_college.std.s14003.pdp.command.command.Command;

import java.awt.*;

/**
 * Created by s14003 on 15/06/18.
 */
public class DrawCommand implements Command {
    protected Drawble drawble;

    private Point position;

    public DrawCommand(Drawble drawble, Point position) {
        this.drawble = drawble;
        this.position = position;
    }

    @Override
    public void execute() {
        drawble.draw(position.x,position.y);
    }
}
