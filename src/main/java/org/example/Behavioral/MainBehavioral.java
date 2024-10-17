package org.example.Behavioral;

import java.util.Scanner;

public class MainBehavioral {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть загальну ціну квитка: ");
        int input = scanner.nextInt();
        Ticket childTicket = new Ticket(new ChildTicketPrice(), input);
        Ticket adultTicket = new Ticket(new AdultTicketPrice(), input);
        Ticket businessTicket = new Ticket(new BusinessTicketPrice(), input);
        System.out.println("Вартість дитячого квитка: " + childTicket.getPrice());
        System.out.println("Вартість дорослого квитка: " + adultTicket.getPrice());
        System.out.println("Вартість квитка бізнес-класу: " + businessTicket.getPrice());
    }
}
// Використання цього патерну "Strategy" доцільне в цьому випадку, тому що:
// 1. Патерн "Strategy" дозволяють легко додавати нові алгоритми розрахунку ціни, не змінюючи класу Ticket.
// 2. Замість використання великого коду в класі Ticket з умовами для різних типів квитків, патерн Strategy розбиває логіку
// на окремі незалежні класи, що полегшує підтримку та розширення коду.