package hcute.hoo.design.pattern.behavioral.command;

import java.util.ArrayList;
import java.util.List;

public class Staff {

    private List<Command> commands = new ArrayList<Command>();

    public void addCommand(Command command) {
        commands.add(command);
    }

    public void executeCommand(){
        for (Command command : commands) {
            command.execute();
        }
        commands.clear();
    }
}

