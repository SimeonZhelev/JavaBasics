package FirstStepsInCodingExercises;

import java.util.Scanner;

public class FoodDelivery_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int chickenMenus = Integer.parseInt(scanner.nextLine());
        int fishMenus = Integer.parseInt(scanner.nextLine());
        int vegetarianMenus = Integer.parseInt(scanner.nextLine());

        double chickenMenuPrice = chickenMenus * 10.35;
        double fishMenuPrice = fishMenus * 12.40;
        double vegetarianMenuPrice = vegetarianMenus * 8.15;
        double deliveryPrice = 2.50;

        double totalFood = chickenMenuPrice + fishMenuPrice + vegetarianMenuPrice;
        double desert = totalFood * 0.2;
        double totalSum = totalFood + desert + deliveryPrice;

        System.out.println(totalSum);

    }
}
