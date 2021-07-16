package io.ssc.zork.inventory;

import io.ssc.zork.Game;

public class Stardust implements Item {

    public String getName() {
        return "stardust";
    }

    @Override
    public int AttackPower() {
        return 100000;
    }

    @Override
    public void use(Game game) {

    }
}
