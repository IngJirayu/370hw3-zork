package io.ssc.zork.Maps;

import io.ssc.zork.entity.Monster.Monster;
import io.ssc.zork.inventory.Item;

import java.util.*;

public class Room {

    private Item item;
    private Monster monster;
    private String roomName;
    private HashMap<String, Room> exits = new HashMap<>();

    public Room(String roomName){
        this.roomName = roomName;
    }

    public String getName() {
        return roomName;
    }

        public void setExits(Room north, Room east, Room south, Room west)
        {
            if(north != null)
                exits.put("north", north);
            if(east != null)
                exits.put("east", east);
            if(south != null)
                exits.put("south", south);
            if(west != null)
                exits.put("west", west);
        }

    private String exitString()
    {
        String returnString = "Exits:";
        Set keys = exits.keySet();
        for(Iterator iter = keys.iterator(); iter.hasNext(); )
            returnString += " " + iter.next();
        return returnString;
    }

    public Room nextRoom(String direction){
        return (Room)exits.get(direction);
    }

    public void setMonster(Monster monster) {
        this.monster = monster;
    }

    public Monster getMonster() {
        return monster;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public void itemReset(){
        this.item = null;
    }
    public void killMonster(){
        this.monster = null;
    }
}


