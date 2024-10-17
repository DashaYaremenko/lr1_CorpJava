package org.example.Creational;
import java.util.Date;
// Клас TicketBuilder реалізує патерн "Builder"
// Патерн "Builder" використовується для поетапного створення об'єктів.
// Дозволяє розділяти процес створення об'єкта на кілька етапів, забезпечуючи зручність, коли потрібно встановити лише частину параметрів або встановлювати поступово.
public class TicketBuilder {
    int idTicket;
    int numberClient;
    int numberTrain;
    int numberCarriage;
    String station1;
    String station2;
    String nameTrain;
    Date cruiseDate1;
    Date cruiseDate2;
    String lastNameClient;
    String firstNameClient;

    // Конструктор з обов'язковими параметрами
    public TicketBuilder(int idTicket, int numberClient) {
        this.idTicket = idTicket;
        this.numberClient = numberClient;
    }
    // Методи для встановлення додаткових параметрів з поверненням поточного об'єкта
    public TicketBuilder numberTrain(int numberTrain) {
        this.numberTrain = numberTrain;
        return this;
    }
    public TicketBuilder numberCarriage(int numberCarriage) {
        this.numberCarriage = numberCarriage;
        return this;
    }
    public TicketBuilder station1(String station1) {
        this.station1 = station1;
        return this;
    }
    public TicketBuilder station2(String station2) {
        this.station2 = station2;
        return this;
    }
    public TicketBuilder nameTrain(String nameTrain) {
        this.nameTrain = nameTrain;
        return this;
    }
    public TicketBuilder cruiseDate1(Date cruiseDate1) {
        this.cruiseDate1 = cruiseDate1;
        return this;
    }
    public TicketBuilder cruiseDate2(Date cruiseDate2) {
        this.cruiseDate2 = cruiseDate2;
        return this;
    }
    public TicketBuilder lastNameClient(String lastNameClient) {
        this.lastNameClient = lastNameClient;
        return this;
    }
    public TicketBuilder firstNameClient(String firstNameClient) {
        this.firstNameClient = firstNameClient;
        return this;
    }

    // Методи для отримання параметрів квитка
    public int getIdTicket() { return idTicket; }
    public int getNumberClient() { return numberClient; }
    public int getNumberTrain() { return numberTrain; }
    public int getNumberCarriage() { return numberCarriage; }
    public String getStation1() { return station1; }
    public String getStation2() { return station2; }
    public String getNameTrain() { return nameTrain; }
    public Date getCruiseDate1() { return cruiseDate1; }
    public Date getCruiseDate2() { return cruiseDate2; }
    public String getLastNameClient() { return lastNameClient; }
    public String getFirstNameClient() { return firstNameClient; }

    // Метод build() завершує процес побудови об'єкта квитка.
    // Викликається після встановлення всіх необхідних параметрів.
    public Ticket build() {
        return Ticket.createTicket(this); //  Цей метод викликає клас Ticket для створення квитка
    }
}
// Використання цього патерну "Builder" доцільне в цьому випадку, тому що:
// 1. Об'єкт квитка містить багато параметрів.
// 2. Сам процес створення квитка може бути гнучким: спочатку ввести необхідні параметри, а потім додати додаткові параметри.
// 3. Патерн Builder уникає використання великої кількості перевантажених конструкторів для кожної можливої комбінації параметрів.
// 4. Зручний спосіб використання ланцюжка методів, який дозволяє створювати квитки в кілька кроків без плутанини.

