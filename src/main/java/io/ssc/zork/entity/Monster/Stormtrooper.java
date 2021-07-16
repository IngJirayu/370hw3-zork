package io.ssc.zork.entity.Monster;

public class Stormtrooper implements Monster{

    private int health = 20;

    @Override
    public int AttackPoint() {
        return 1;
    }

    @Override
    public boolean isAlive() {
        return health > 0;
    }
}
