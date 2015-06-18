package jp.ac.it_college.std.s14003.pdp.command.command;

import java.util.*;

/**
 * Created by s14003 on 15/06/18.
 */
public class MacroCommand implements Command{
    private Deque<Command> commands = new ArrayDeque<>();
    @Override
    public void execute() {
        for (Command com : commands) {
            com.execute();
        }
    }
    public void append(Command cmd) {
        if (cmd != this) {
            commands.push(cmd);
        }
    }
    public void undo() {
        if (!commands.isEmpty()) {
            commands.pop();
        }
    }
    public void clear() {
        commands.clear();
    }
}
