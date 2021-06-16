package io.ssc.zork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class CommandParser {

    private List<String> allCommandsSortedByLength = new ArrayList<>();
    {
        CommandFactory.getAllCommands().sort((o1, o2) -> o2.length() - o1.length());
    }

    private String matchInputToCommand(String input){
        for (String command: allCommandsSortedByLength) {
            if (input.startsWith(command)) {
                return command;
            }
        }
        return null;
    }

    public List<String> parse(String stringInput){
        String  cleanedInput = stringInput.trim();
        String command = matchInputToCommand(cleanedInput);
        String argString = cleanedInput.substring(command.length());

        String[] strings = stringInput.trim().split(" ");
        return Arrays.asList(strings);
    }

}
