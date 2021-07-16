package io.ssc.zork.inventory;

import io.ssc.zork.Game;

public class Stardust implements Items{

    private String name = "stardust";

    public String getName() {
        return name;
    }

    @Override
    public int AttackPower() {
        return 100000;
    }

    @Override
    public void use(Game game) {

    }
}
