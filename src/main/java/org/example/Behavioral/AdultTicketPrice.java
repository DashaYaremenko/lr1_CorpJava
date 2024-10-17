package org.example.Behavioral;
//  Розрахунок ціни квитка для дорослого
public class AdultTicketPrice implements TicketPrice {
    @Override
    public double calculateTicketPrice(double price) {
        return price;
    }
}
