package FirstStepsInCodingExercises;

import java.util.Scanner;

public class SuppliesforSchool_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countPenPackages = Integer.parseInt(scanner.nextLine());
        int countHighlightersPackages = Integer.parseInt(scanner.nextLine());
        int cleaningAgent = Integer.parseInt(scanner.nextLine());
        int discount = Integer.parseInt(scanner.nextLine());

        double penPrice = countPenPackages * 5.80;
        double highlighterPrice = countHighlightersPackages * 7.20;
        double cleaningAgentPrice = cleaningAgent * 1.20;

        double sumWithoutDiscount = penPrice + highlighterPrice + cleaningAgentPrice;
        double finalSum = sumWithoutDiscount - (sumWithoutDiscount * (discount / 100.0));

        System.out.println(finalSum);



    }
}
