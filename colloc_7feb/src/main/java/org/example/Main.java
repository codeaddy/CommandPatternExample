package org.example;

public class Main {
    /**
     * Общая идея - в ресторанах на столах иногда стоят штучки, чтобы вызывать официанта.
     * В моем примере есть 3 опции - запросить счет, вызвать официанта на помощь, запросить книгу
     * жалоб и предложений.
     * Есть абстрактный класс Command, от него наследуются все конкретные виды команд
     * У каждого клиента есть пулл запросов, которые можно накопить, а потом вызвать
     *
     * @param args
     */
    public static void main(String[] args) {
        Client client1 = new Client("John");
        Client client2 = new Client("Rebecca");

        Waiter waiter1 = new Waiter("Steve");
        Waiter waiter2 = new Waiter("Stephan");

        client1.addCommand(new HelpCommand(waiter1, "Broken glass"));
        client1.addCommand(new BillCommand(waiter1, 150));

        client2.addCommand(new ComplaintCommand(waiter2));
        client2.addCommand(new BillCommand(waiter2, 70));

        client1.executeCommands();
        client2.executeCommands();
    }
}