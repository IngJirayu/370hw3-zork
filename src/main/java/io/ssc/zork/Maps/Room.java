package io.ssc.zork.Maps;

public class Room {

    String name;
    Room north, east, south, west;

    protected void roomSet(String name,
                         Room north,
                         Room south,
                         Room east,
                         Room west){

        this.name = name;
        this.north = north;
        this.south = south;
        this.east = east;
        this.west = west;
    }

    public String getName() {
        return name;
    }

}
