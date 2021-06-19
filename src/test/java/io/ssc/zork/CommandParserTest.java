package io.ssc.zork;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CommandParserTest {

    @Test
    void TestParser() {
        CommandParser commandParser = new CommandParser();
        commandParser.parse("exithelloworld");
    }
}