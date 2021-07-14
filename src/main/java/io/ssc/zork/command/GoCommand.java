package io.ssc.zork.command;

import io.ssc.zork.Game;
import io.ssc.zork.Maps.Room;
import io.ssc.zork.Maps.RoomOne;

import java.util.ArrayList;
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
        Room checkRoom = game.getCurrentRoom().nextRoom(args.get(0));
        switch (args.get(0)){
            case ("north"):
            case ("east"):
            case ("south"):
            case ("west"):
                if (checkRoom == null) System.out.println("No exit in the " + args.get(0));break;
        }

        if (game.getCurrentRoom().nextRoom(args.get(0)) == null) {
            System.out.println("Try again with new direction");
        } else {
            System.out.println("Walking to the " + game.getCurrentRoom().nextRoom(args.get(0)).getName() + "....");
            game.setCurrentRoom(game.getCurrentRoom().nextRoom(args.get(0)));
        }
    }
}
