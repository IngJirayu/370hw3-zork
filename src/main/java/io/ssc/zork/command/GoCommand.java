package io.ssc.zork.command;

import io.ssc.zork.Game;
import io.ssc.zork.Maps.Room;
import io.ssc.zork.Maps.RoomOne;

import java.util.List;

public class GoCommand implements Command{

    @Override
    public int numArgs() {
        return 1;
    }

    @Override
    public String getCommand() {
        return "go";
    }

    @Override
    public void execute(Game game, List<String> args) {
        System.out.println("Walking to the " + game.getCurrentRoom().nextRoom(args.get(0)).getName() + "....");
        game.setCurrentRoom(game.getCurrentRoom().nextRoom(args.get(0)));

    }
}
