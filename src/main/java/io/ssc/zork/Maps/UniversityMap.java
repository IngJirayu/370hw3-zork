package io.ssc.zork.Maps;

public class UniversityMap {

    Room patio= new Room();
    Room corridor = new Room();
    Room cafeteria = new Room();
    Room lockerRoom = new Room();
    Room swimmingPool = new Room();
    Room auditorium = new Room();
    Room library = new Room();

    private UniversityMap(){
        patio.roomSet("patio", corridor, null, null, null);
        corridor.roomSet("corridor", auditorium, patio, library, cafeteria);
        cafeteria.roomSet("cafeteria", lockerRoom, null, corridor, null);
        lockerRoom.roomSet("locker room", swimmingPool, cafeteria, auditorium, null);
        swimmingPool.roomSet("swimming pool", null, lockerRoom, null, null);
        auditorium.roomSet("auditorium", null, corridor, null, lockerRoom);
        library.roomSet("library", null, null, null, corridor);

    }


//    public static void main(String[] args) {
//        UniversityMap map = new UniversityMap();
//        System.out.println(map.patio.north.name);
//        System.out.println(map.patio.south);
//        System.out.println(map.corridor.west.name);
//        System.out.println(map.lockerRoom.north.name);
//        System.out.println(map.corridor.south.name);
//        System.out.println(map.auditorium.south.name);
//        System.out.println(map.library.west.name);
//    }



}
