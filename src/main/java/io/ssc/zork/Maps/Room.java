package io.ssc.zork.Maps;

import io.ssc.zork.inventory.Items;

import java.net.PortUnreachableException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

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

    public void setExit(char direction, Room r) throws Exception{
        String dir= "";
        switch (direction) {
            case 'E':
                dir = "east";
                break;
            case 'W':
                dir = "west";
                break;
            case 'S':
                dir = "south";
                break;
            case 'N':
                dir = "north";
                break;
            default:
                throw new Exception("Invalid Direction");
        }
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

    public Room nextRoom(String direction)
    {
        return (Room)exits.get(direction);
    }

}


