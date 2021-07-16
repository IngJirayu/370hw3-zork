package io.ssc.zork.entity.Monster;

public class Zombie implements Monster{

    private int health = 9;

    @Override
    public int AttackPoint() {
        return 5;
    }

    @Override
    public boolean isAlive() {
        return health > 0;
    }


}
