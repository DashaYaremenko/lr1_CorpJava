package org.example.Creational;

import java.util.Date;

public class Ticket {
    private int idTicket;
    private int numberClient;
    private int numberTrain;
    private int numberCarriage;
    private String lastNameClient;
    private String firstNameClient;
    private String station1;
    private String station2;
    private String nameTrain;
    private Date cruiseDate1;
    private Date cruiseDate2;
    private Ticket(TicketBuilder ticketBuilder) {
        this.idTicket=ticketBuilder.idTicket;
        this.numberClient=ticketBuilder.numberClient;
        this.numberTrain=ticketBuilder.numberTrain;
        this.numberCarriage=ticketBuilder.numberCarriage;
        this.station1=ticketBuilder.station1;
        this.station2=ticketBuilder.station2;
        this.nameTrain=ticketBuilder.nameTrain;
        this.cruiseDate1=ticketBuilder.cruiseDate1;
        this.cruiseDate2=ticketBuilder.cruiseDate2;
        this.lastNameClient=ticketBuilder.lastNameClient;
        this.firstNameClient=ticketBuilder.firstNameClient;
    }
    public String toString() {
        return "Білет [ID: " + idTicket +
                ", Номер клієнта: " + numberClient +
                ", Призвіще: " + lastNameClient+
                ", Ім'я: " + firstNameClient+
                ", Номер потяга: " + numberTrain +
                ", Назва потяга: " + nameTrain +
                ", Номер вагону: " + numberCarriage +
                ", Станція відправлення: " + station1 +
                ", Станція прибуття: " + station2 +
                ", Дата відправлення: " + cruiseDate1 +
                ", Дата прибуття: " + cruiseDate2 + "]";
    }

    public static Ticket createTicket(TicketBuilder ticketBuilder) {
        return new Ticket(ticketBuilder);
    }
}
