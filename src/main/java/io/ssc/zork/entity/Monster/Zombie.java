package io.ssc.zork.entity.Monster;

public class Zombie implements Monster{

    private int health = 35;

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
        return "They aren't infectious but are hard to kill";
    }

    @Override
    public int getHealth() {
        return health;
    }

    @Override
    public void setHealth(int attackPoint) {
        health = health - attackPoint;
    }


}
