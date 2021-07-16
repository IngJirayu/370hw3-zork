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

    @Override
    public String name() {
        return "BROLY!!";
    }

    @Override
    public String description() {
        return "DO NOT ENGAGE! WAY TO KILL: UNKNOWN YET";
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
