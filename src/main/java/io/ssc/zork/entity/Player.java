package io.ssc.zork.entity;

public class Player{

    private int Health = 0;
    private final int MAX_HEALTH = 50;

    public Player(){
    }

    public int getHealth() {
        return Health;
    }

    public int getMAX_HEALTH() {
        return MAX_HEALTH;
    }

    public void setHealth(int health) {
        if (Health >= MAX_HEALTH){
        } else {
            Health = health;
        }


    }
}
