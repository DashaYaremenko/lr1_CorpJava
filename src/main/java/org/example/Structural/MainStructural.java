package org.example.Structural;

public class MainStructural {
    public static void main(String[] args) {
        RailwayStationCheck railwayStationCheck=new RailwayStationCheck();
        railwayStationCheck.checkTicketPayment();
    }
}
// Використання цього патерну "Facade" доцільне в цьому випадку, тому що:
// Клієнт не має потреби знати, як взаємодіють різні компоненти підсистеми (бронювання, перевірка, оплата). Він викликає лише один метод, а Facade робить все інше.
// Якщо зміниться логіка будь-якої з підсистем, то це не вплине на клієнтський код, оскільки взаємодія йде через Facade.
