package io.ssc.zork.Maps;

import io.ssc.zork.entity.Monster.Broly;
import io.ssc.zork.entity.Monster.Stormtrooper;
import io.ssc.zork.entity.Monster.Zombie;
import io.ssc.zork.inventory.Spear;
import io.ssc.zork.inventory.Stardust;
import io.ssc.zork.inventory.Sword;

public class RoomOne{
    Room patio = new Room("patio");
    Room corridor = new Room("corridor");
    Room cafeteria = new Room("cafeteria");
    Room locker = new Room("locker");
    Room auditorium = new Room("auditorium");
    Room library = new Room("library");
    Room currentRoom = patio;

    public Room getCurrentRoom() {
        return currentRoom;
    }

    public RoomOne(){
        //maps
        patio.setExits(corridor,null, null,null);
        corridor.setExits(auditorium, library, patio, cafeteria);
        cafeteria.setExits(locker, corridor, null, null);
        locker.setExits(null, auditorium, cafeteria, null);
        auditorium.setExits(null, null, corridor, locker);
        library.setExits(null, null, null, corridor);

        //Monster
        auditorium.setMonster(new Broly());
        library.setMonster(new Zombie());
        locker.setMonster(new Stormtrooper());
        corridor.setMonster(new Stormtrooper());

        //Items
        patio.setItem(new Spear());
        library.setItem(new Stardust());
        corridor.setItem(new Sword());
    }


}
