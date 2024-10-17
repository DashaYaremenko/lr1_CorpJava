package org.example.Creational;

import java.util.Date;
import java.util.Scanner;

public class MainTicket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введіть прізвище клієнта: ");
        String lastNameClient = sc.nextLine();
        System.out.print("Введіть ім'я клієнта: ");
        String firstNameClient = sc.nextLine();
        System.out.print("Введіть номер поїзда: ");
        int numberTrain = sc.nextInt();
        sc.nextLine();
        System.out.print("Введіть назву поїзда: ");
        String nameT = sc.nextLine();
        System.out.print("Введіть номер вагону: ");
        int numberCarriage = sc.nextInt();
        sc.nextLine();
        System.out.print("Введіть станцію відправлення: ");
        String station1 = sc.nextLine();
        System.out.print("Введіть станцію прибуття: ");
        String station2 = sc.nextLine();

        Ticket ticket = new TicketBuilder(12345, 67890)
                .lastNameClient(lastNameClient)
                .firstNameClient(firstNameClient)
                .numberTrain(numberTrain)
                .nameTrain(nameT)
                .numberCarriage(numberCarriage)
                .station1(station1)
                .station2(station2)
                .cruiseDate1(new Date())
                .cruiseDate2(new Date(System.currentTimeMillis() + 3600 * 1000 * 5)) // 5 годин поїздки
                .build();

        System.out.println(ticket);
        sc.close();
    }
}
