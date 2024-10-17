package org.example.Behavioral;
//  Розрахунок ціни квитка для бізнес-класу
public class BusinessTicketPrice implements TicketPrice {
    @Override
    public double calculateTicketPrice(double price) {
        return price*1.5;
    }
}

