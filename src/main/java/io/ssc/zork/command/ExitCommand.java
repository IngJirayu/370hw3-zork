package io.ssc.zork.command;

import io.ssc.zork.Game;

import java.util.List;

public class ExitCommand implements Command{

    @Override
    public int numArgs() {
        return 0;
    }

    @Override
    public String getCommand() {
        return "exit";
    }

    @Override
    public void execute(Game game, List<String> args) {
        game.getOutput().println("Exit Game");
        game.exit();
    }
}
