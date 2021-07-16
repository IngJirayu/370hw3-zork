package io.ssc.zork.command;

import io.ssc.zork.Game;
import io.ssc.zork.entity.Monster.Monster;

import java.util.List;

public class AttackWithCommand implements Command{
    @Override
    public int numArgs() {
        return 1;
    }

    @Override
    public String getCommand() {
        return "attack with";
    }

    @Override
    public void execute(Game game, List<String> args) {
        String weaponChoice = args.get(0);
        Monster monster = game.getCurrentRoom().getMonster();
        if (game.getPlayer().getItems(weaponChoice) == null){
            System.out.println("You ain't got that weapon bro :0");
        }else {
            if (monster == null){
                System.out.println("WTH are you attacking... there's nothing here");
            } else {
                monster.setHealth(game.getPlayer().getItems(weaponChoice).AttackPower());
                if (!monster.isAlive()){
                    System.out.println("You killed it, nice");
                    game.getCurrentRoom().killMonster();
                }else {
                    System.out.println(monster.name() + "'s health: " + monster.getHealth());
                }
                game.getPlayer().attacked(monster.AttackPoint());
                if (!game.getPlayer().isAlive()){
                    System.out.println("You ded bro");
                    System.out.println("YOU LOST");
                    game.exit();
                }
            }
        }
    }
}
