package io.ssc.zork.Maps;

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
        patio.setExits(corridor,null, null,null);
        corridor.setExits(auditorium, library, patio, cafeteria);
        cafeteria.setExits(locker, corridor, null, null);
        locker.setExits(null, auditorium, cafeteria, null);
        auditorium.setExits(null, null, corridor, locker);
        library.setExits(null, null, null, corridor);
    }

    public static void main(String[] args) {
        RoomOne one = new RoomOne();
        System.out.println(one.currentRoom.nextRoom("north").nextRoom("east").getName());
    }

}
