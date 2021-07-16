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

    @Override
    public String name() {
        return "stormtrooper";
    }

    @Override
    public String description() {
        return "The armour seems strong but I doubt they're gonna cost " +
                "much damage considering their shit aim";
    }

    @Override
    public int getHealth() {
        return health;
    }
}
