package org.example.Behavioral;
// Клас TicketPrice є абстракцією для стратегії розрахунку ціни квитка
// Патерн "Strategy" дозволяє змінювати алгоритм розрахунку ціни без зміни класу Ticket
public interface TicketPrice {
    double calculateTicketPrice(double price);
}
