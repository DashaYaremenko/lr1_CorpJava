package org.example.Behavioral;
//  Розрахунок ціни квитка для дітей
public class ChildTicketPrice implements TicketPrice {
    @Override
    public double calculateTicketPrice(double price) {
        return price * 0.5;
    }
}
