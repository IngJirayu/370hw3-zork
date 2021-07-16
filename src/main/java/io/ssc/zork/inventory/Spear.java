package io.ssc.zork.inventory;

import io.ssc.zork.Game;

public class Spear implements Items{

    private String name = "spear";

    public String getName() {
        return name;
    }

    @Override
    public int AttackPower() {
        return 8;
    }

    @Override
    public void use(Game game) {

    }
}
