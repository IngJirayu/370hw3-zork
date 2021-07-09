package io.ssc.zork.command;

import io.ssc.zork.CommandFactory;
import io.ssc.zork.Game;

import java.util.List;

public class HelpCommand implements Command{


    @Override
    public int numArgs() {
        return 0;
    }

    @Override
    public String getCommand() {
        return "help";
    }

    @Override
    public void execute(Game game, List<String> args) {
        List<String> commands = CommandFactory.getAllCommands();
        commands.remove("notValidCommand");
        for (String command : commands) {
            System.out.println(command);
        }
    }
}
