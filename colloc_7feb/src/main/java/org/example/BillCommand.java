package org.example;

/**
 * Класс команды, отвечающей за запрос счета
 */

public class BillCommand extends Command {
    // Стоимость
    private final int bill;

    BillCommand(Waiter waiter, int bill) {
        super(waiter);
        this.bill = bill;
    }

    String execute() {
        return "Waiter " + waiter.getName() + " brought you a bill with $" + bill + ".\n";
    }
}
