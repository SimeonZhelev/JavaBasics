package ConditionalStatementsAdvancedExercises;

import java.util.Scanner;

public class NewHouse_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String flowers = scanner.nextLine();
        int flowersCount = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());
        double totalSum = 0;

        switch (flowers) {
            case "Roses":
                totalSum = flowersCount * 5;
                if (flowersCount > 80) {
                    totalSum = totalSum * 0.9;
                }
                break;
            case "Dahlias":
                totalSum = flowersCount * 3.80;
                if (flowersCount > 90) {
                    totalSum = totalSum * 0.85;
                }
                break;
            case "Tulips":
                totalSum = flowersCount * 2.80;
                if (flowersCount > 80) {
                    totalSum = totalSum * 0.85;
                }
                break;
            case "Narcissus":
                totalSum = flowersCount * 3;
                if (flowersCount < 120) {
                    totalSum = totalSum * 1.15;
                }
                break;
            case "Gladiolus":
                totalSum = flowersCount * 2.50;
                if (flowersCount < 80) {
                    totalSum = totalSum * 1.20;
                }
                break;
        }
        double diff = Math.abs(budget - totalSum);
        if (budget >= totalSum) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", flowersCount, flowers, diff);
        } else {
            System.out.printf("Not enough money, you need %.2f leva more.",diff);
        }
    }
}
