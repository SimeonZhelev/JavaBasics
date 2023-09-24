package Exam2023;

import java.util.Scanner;

public class Task_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        int nights = Integer.parseInt(scanner.nextLine());
        int transportCards = Integer.parseInt(scanner.nextLine());
        int countTickets = Integer.parseInt(scanner.nextLine());

        double nightsPrice = 20;
        double transportCardsPrice = 1.60;
        double ticketPrice = 6;

        double nightsFinal = nights * nightsPrice;
        double cardsFinal = transportCards * transportCardsPrice;
        double ticketsFinal = countTickets * ticketPrice;

        double sumForOne = nightsFinal + cardsFinal + ticketsFinal;
        double sumForAll = sumForOne * people;

        double finalSum = sumForAll + (sumForAll * 0.25);

        System.out.printf("%.2f",finalSum);
    }
}
