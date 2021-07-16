package io.ssc.zork.inventory;

import io.ssc.zork.Game;

public class Sword implements Items{

    private String name = "sword";


    String getName() {
        return name;
    }

    @Override
    public int AttackPower() {
        return 10;
    }

    @Override
    public void use(Game game) {

    }
}
