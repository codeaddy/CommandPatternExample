package org.example;

import java.util.ArrayList;
import java.util.List;


/**
 * Класс посетителя ресторана
 */
public class Client {
    private final String name;
    private List<Command> commands;

    Client(String name) {
        this.name = name;
        commands = new ArrayList<>();
    }

    void addCommand(Command command) {
        commands.add(command);
    }

    void executeCommands() {
        for (Command command : commands) {
            var result = command.execute();
            System.out.print(name + " request result: " + result);
        }
    }

    public String getName() {
        return name;
    }
}
