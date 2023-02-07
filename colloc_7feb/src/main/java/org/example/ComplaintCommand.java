package org.example;

/**
 * Класс команды, отвечающей за запрос книги жалоб и предложений
 */

public class ComplaintCommand extends Command {
    ComplaintCommand(Waiter waiter) {
        super(waiter);
    }

    String execute() {
        return "Waiter " + waiter.getName() + " brought you a complaint book.\n";
    }
}
