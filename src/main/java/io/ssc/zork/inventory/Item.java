package io.ssc.zork.inventory;

import io.ssc.zork.Game;

public interface Item {

    public String getName();

    int AttackPower();

    void use(Game game);

}
