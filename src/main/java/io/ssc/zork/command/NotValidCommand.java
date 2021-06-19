package io.ssc.zork.command;

import io.ssc.zork.Game;

import java.util.List;

public class NotValidCommand implements Command{
    @Override
    public int numArgs() {
        return 0;
    }

    @Override
    public String getCommand() {
        return "notValidCommand";
    }

    @Override
    public void execute(Game game, List<String> args) {
        game.getOutput().println("Please enter a valid command or type help if u is dumb");
    }
}
