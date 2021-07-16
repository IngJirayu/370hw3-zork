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

    @Override
    public String name() {
        return "zombie";
    }

    @Override
    public String description() {
        return "They aren't infectious, you could literally win using ur fist";
    }

    @Override
    public int getHealth() {
        return health;
    }
}
