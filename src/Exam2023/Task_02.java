package Exam2023;

import java.util.Scanner;

public class Task_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        double leftFood = Double.parseDouble(scanner.nextLine());
        double dailyFoodOne = Double.parseDouble(scanner.nextLine());
        double dailyFoodTwo = Double.parseDouble(scanner.nextLine());
        double dailyFoodThree = Double.parseDouble(scanner.nextLine());

        double deerOne = days * dailyFoodOne;
        double deerTwo = days * dailyFoodTwo;
        double deerThree = days * dailyFoodThree;

        double sumFood = deerOne + deerTwo + deerThree;

        if (sumFood<leftFood){
            double foodLeft = leftFood - sumFood;
            System.out.printf("%.0f kilos of food left.",Math.floor(foodLeft));
        } else {
            double neededFood = sumFood - leftFood;
            System.out.printf("%.0f more kilos of food are needed.",Math.ceil(neededFood));
        }

    }
}
