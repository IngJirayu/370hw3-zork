package io.ssc.zork.entity;

import io.ssc.zork.inventory.Item;

import java.util.*;

public class Player{

    private int health = 0;
    private final int MAX_HEALTH = 50;
    private Map<String, Item> items = new HashMap<>();

    public Player(){
    }

    public int getHealth() {
        return health;
    }

    public int getMAX_HEALTH() {
        return MAX_HEALTH;
    }

    public Item getItems(String item) {
        return items.get(item);
    }

    public void addItem(String itemName, Item item){
        items.put(itemName, item);
    }

    public void setHealth(int health) {
        if (health >= MAX_HEALTH){
        } else {
            this.health = health;
        }
    }

    public boolean isAlive(){
        if (health <= 0){
            return false;
        } else {
            return true;
        }
    }
    public void attacked(int ap){
        health -= ap;
    }
    public void removeItem(String item){
        items.remove(item);
    }
}
