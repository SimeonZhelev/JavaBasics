package ConditionalStatementsAdvancedExercises;

import java.util.Scanner;

public class HotelRoom_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String month = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());
        double priceForStudio = 0;
        double priceForApartment = 0;

        switch (month){
            case "May":
            case "October":
                priceForStudio = nights * 50;
                priceForApartment = nights * 65;
                if (nights>7 && nights<14) {
                    priceForStudio = priceForStudio * 0.95;
                } else if (nights>14) {
                    priceForStudio = priceForStudio * 0.7;
                    priceForApartment = priceForApartment * 0.9;
                }
                break;
            case "June":
            case "September":
                priceForStudio = nights * 75.20;
                priceForApartment = nights * 68.70;
                if (nights>14){
                    priceForStudio = priceForStudio * 0.8;
                    priceForApartment = priceForApartment * 0.9;
                }
                break;
            case "July":
            case "August":
                priceForStudio = nights * 76;
                priceForApartment = nights * 77;
                if (nights>14){
                    priceForApartment = priceForApartment * 0.9;
                }
                break;
        }

        System.out.printf("Apartment: %.2f lv.%n",priceForApartment);
        System.out.printf("Studio: %.2f lv.",priceForStudio);
    }
}
