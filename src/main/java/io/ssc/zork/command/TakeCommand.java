package io.ssc.zork.command;

import io.ssc.zork.Game;
import io.ssc.zork.inventory.Item;

import java.util.List;

public class TakeCommand implements Command{
    @Override
    public int numArgs() {
        return 1;
    }

    @Override
    public String getCommand() {
        return "take";
    }

    @Override
    public void execute(Game game, List<String> args) {
        String item = game.getCurrentRoom().getItem().getName();
        if (item.equals(args.get(0))){
            game.getPlayer().addItem(item, game.getCurrentRoom().getItem());
            System.out.println("picked up " + item);
            game.getCurrentRoom().itemReset();
        } else {
            System.out.println(args.get(0) + " not present in this room");
        }
    }
}
