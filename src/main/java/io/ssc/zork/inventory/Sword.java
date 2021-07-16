package io.ssc.zork.inventory;

import io.ssc.zork.Game;

public class Sword implements Item {

    public String getName() {
        return "sword";
    }

    @Override
    public int AttackPower() {
        return 10;
    }

    @Override
    public void use(Game game) {

    }
}
