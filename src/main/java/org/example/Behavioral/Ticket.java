package org.example.Behavioral;
// Клас Ticket використовує патерн "Strategy" для розрахунку ціни квитка
public class Ticket {
    private TicketPrice ticket;
    private double price;
    public Ticket(TicketPrice ticket, double price) {
        this.ticket = ticket;
        this.price = price;
    }
    // Метод для отримання кінцевої ціни квитка
    // Патерн "Strategy" дозволяє динамічно змінювати алгоритм розрахунку ціни
    public double getPrice() {
        return ticket.calculateTicketPrice(price);
    }
}
