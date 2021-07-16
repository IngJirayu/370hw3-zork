package io.ssc.zork.command;

import io.ssc.zork.Game;

import java.util.List;

public class InfoCommand implements Command{
    @Override
    public int numArgs() {
        return 0;
    }

    @Override
    public String getCommand() {
        return "info";
    }

    @Override
    public void execute(Game game, List<String> args) {
        System.out.println("Your health: " + game.getPlayer().getHealth() + "/" + game.getPlayer().getMAX_HEALTH());
        System.out.println("You are now in the " + game.getCurrentRoom().getName());
    }
}
