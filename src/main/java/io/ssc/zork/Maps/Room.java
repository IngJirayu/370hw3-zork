package io.ssc.zork.Maps;

import io.ssc.zork.Game;
import io.ssc.zork.command.NotValidCommand;
import io.ssc.zork.inventory.Items;

import java.net.PortUnreachableException;
import java.util.*;

public class Room {

    private Items item;
    private String roomName;
    private String description;
    private ArrayList<Items> itemList;
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

}


