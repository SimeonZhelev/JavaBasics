package FirstStepsInCodingExercises;

import java.util.Scanner;

public class DepositCalculator_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double deposit = Double.parseDouble(scanner.nextLine());
        int months = Integer.parseInt(scanner.nextLine());
        double interestRate = Double.parseDouble(scanner.nextLine());

        double profitPerMonth = (deposit * (interestRate / 100)) / 12;

        double totalSum = deposit + profitPerMonth * months;

        System.out.println(totalSum);
    }
}
