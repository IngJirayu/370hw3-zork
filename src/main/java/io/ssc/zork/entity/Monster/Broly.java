package io.ssc.zork.entity.Monster;

public class Broly implements Monster{

    private int health = 100000;

    @Override
    public int AttackPoint() {
        return 50000;
    }

    @Override
    public boolean isAlive() {
        return health > 0;
    }
}
