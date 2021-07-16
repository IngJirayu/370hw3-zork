package io.ssc.zork.command;

import io.ssc.zork.Game;
import io.ssc.zork.entity.Monster.Monster;
import io.ssc.zork.inventory.Item;

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
        System.out.println("Health: " + game.getPlayer().getHealth() + "/" + game.getPlayer().getMAX_HEALTH());
        System.out.println("Room: " + game.getCurrentRoom().getName());

        Monster monster = game.getCurrentRoom().getMonster();
        if (monster != null){
            if (monster.isAlive()){
                System.out.println("MONSTER SPOTTED!");
                System.out.println("NAME: " + monster.name());
                System.out.println("SUGGESTION: " + monster.description());
                System.out.println(monster.name() + "'s health: " + monster.getHealth());
            }
        } else {
            System.out.println("...No monster here...");
        }

        Item item = game.getCurrentRoom().getItem();
        if (item != null){
            System.out.println("ITEM SPOTTED!");
            System.out.println(item.getName());
            System.out.println(item.getName() + "'s attack power: " + item.AttackPower());
        } else {
            System.out.println("...No Weapon here...");
        }

    }
}
