package org.example;

/**
 * Класс команды, отвечающей за запрос помощи официанта
 */

public class HelpCommand extends Command {
    // Категория помощи человеку)
    private final String typeOfHelp;

    HelpCommand(Waiter waiter, String typeOfHelp) {
        super(waiter);
        this.typeOfHelp = typeOfHelp;
    }

    String execute() {
        return "Waiter " + waiter.getName() + " helped you with " + typeOfHelp + ".\n";
    }
}
