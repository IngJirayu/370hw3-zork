package io.ssc.zork.command;

import io.ssc.zork.Game;

import java.util.List;

public interface Command {

    int numArgs();

    String getCommand();

    void execute(Game game);

}
