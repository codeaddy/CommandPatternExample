package org.example;

/**
 * Абстрактный класс команды
 */

public abstract class Command {
    public final Waiter waiter;

    Command(Waiter waiter) {
        this.waiter = waiter;
    }

    abstract String execute();
}
