package Exam2023;

import java.util.Scanner;

public class Task_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int target = Integer.parseInt(scanner.nextLine());

        double menHaircut = 15;
        double womenHaircut = 20;
        double kidsHaircut = 10;
        double touchUp = 20;
        double fullColor = 30;
        double finalSum = 0;

        String input = scanner.nextLine();

        while (!input.equals("closed")) {
            if (input.equals("haircut")) {
                input = scanner.nextLine();
                if (input.equals("ladies")) {
                    finalSum += womenHaircut;
                } else if (input.equals("mens")) {
                    finalSum += menHaircut;
                } else if (input.equals("kids")) {
                    finalSum += kidsHaircut;
                }
            }
            if (input.equals("color")) {
                input = scanner.nextLine();
                if (input.equals("touch up")) {
                    finalSum += touchUp;
                } else if (input.equals("full color")) {
                    finalSum += fullColor;
                }
            }
            if (finalSum >= target) {
                break;
            }
            input = scanner.nextLine();
        }
        if (finalSum >= target) {
            System.out.println("You have reached your target for the day!");
            System.out.printf("Earned money: %.0flv.", finalSum);
        } else if (target > finalSum) {
            System.out.printf("Target not reached! You need %.0flv. more.%n", target - finalSum);
            System.out.printf("Earned money: %.0flv.", finalSum);
        }
    }
}
