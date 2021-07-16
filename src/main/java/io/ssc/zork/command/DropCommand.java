package io.ssc.zork.command;

import io.ssc.zork.Game;
import io.ssc.zork.inventory.Item;

import java.util.List;

public class DropCommand implements Command{
    @Override
    public int numArgs() {
        return 1;
    }

    @Override
    public String getCommand() {
        return "drop";
    }

    @Override
    public void execute(Game game, List<String> args) {
        String item = args.get(0);
        if (game.getPlayer().getItems(item) == null){
            System.out.println("You don't have that item");
        }else {
            game.getPlayer().removeItem(item);
            System.out.println(item + " discarded");
        }
    }
}
