package ConditionalStatementsExercises;

import java.util.Scanner;

public class ToyShop_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double tripPrice = Double.parseDouble(scanner.nextLine());
        int puzzleCount = Integer.parseInt(scanner.nextLine());
        int dollCount = Integer.parseInt(scanner.nextLine());
        int bearCount = Integer.parseInt(scanner.nextLine());
        int minionCount = Integer.parseInt(scanner.nextLine());
        int truckCount = Integer.parseInt(scanner.nextLine());

        int countToys = puzzleCount + dollCount + bearCount + minionCount + truckCount;
        double totalSum = puzzleCount * 2.60 + dollCount * 3 + bearCount * 4.10 + minionCount * 8.20 + truckCount * 2;

        if (countToys >= 50) {
            totalSum = totalSum * 0.75;
        }

        totalSum = totalSum * 0.9;
        if (totalSum >= tripPrice) {
            double tripMoney = totalSum - tripPrice;
            System.out.printf("Yes! %.2f lv left.", tripMoney);
        } else {
            double neededMoney = tripPrice - totalSum;
            System.out.printf("Not enough money! %.2f lv needed.", neededMoney);
        }
    }
}