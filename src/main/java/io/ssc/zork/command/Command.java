package io.ssc.zork.command;

public interface Command {

    int length();

    String getCommand();

    void execute();

}
