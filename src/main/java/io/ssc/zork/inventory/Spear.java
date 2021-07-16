package io.ssc.zork.inventory;

import io.ssc.zork.Game;

public class Spear implements Item {

    public String getName() {
        return "spear";
    }

    @Override
    public int AttackPower() {
        return 8;
    }

    @Override
    public void use(Game game) {

    }
}
