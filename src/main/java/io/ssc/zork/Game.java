package io.ssc.zork;

import io.ssc.zork.Maps.Room;
import io.ssc.zork.Maps.RoomOne;
import io.ssc.zork.command.Command;
import io.ssc.zork.entity.Player;

import java.util.List;
import java.util.Scanner;

public class Game {

    private  GameOutput output = new GameOutput();

    private CommandParser commandParser = new CommandParser();

    private RoomOne mapOne = new RoomOne();
    private Room currentRoom;

    public void setCurrentRoom(Room currentRoom) {
        this.currentRoom = currentRoom;
    }

    public Room getCurrentRoom() {
        return currentRoom;
    }

    //player setup
    Player player = new Player();

    public Player getPlayer(){
        return player;
    }


    public void run(){
        player.setHealth(10);
        System.out.println("Welcome to zork game implemented by ING");
        System.out.println("Type help to see all commands");
        System.out.println("-----------------------------");
        currentRoom = mapOne.getCurrentRoom();
        while (true){
            Scanner in = new Scanner(System.in);
            String s = in.nextLine();
            List<String> words = commandParser.parse(s);
            Command command = CommandFactory.get(words.get(0));
            if (command != null){
                command.execute(this, words.subList(1,words.size()));
            }
        }
    }

    public GameOutput getOutput() {
        return output;
    }

    public void exit() {
        System.exit(0);
    }
}
