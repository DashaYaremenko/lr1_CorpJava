package org.example.Structural;
// Клас RailwayStationCheck є фасадом, який спрощує взаємодію з процесом бронювання, перевірки та оплати квитка.
// Патерн "Facade" надає спрощений інтерфейс для взаємодії з більш складною системою.
public class RailwayStationCheck {
    private TicketReserv ticketReserv;
    private CheckTrain checkTrain;
    private PaymentTicket paymentTicket;
    public RailwayStationCheck() {
        ticketReserv = new TicketReserv();
        checkTrain = new CheckTrain();
        paymentTicket = new PaymentTicket();
    }
    // Метод для спрощеного процесу бронювання, перевірки та оплати квитка.
    public void checkTicketPayment(){
        ticketReserv.bookTicket();
        checkTrain.checkSchedule();
        paymentTicket.processPayment();
        System.out.println("Квиток заброньовано та оплачено.");
    }
}
