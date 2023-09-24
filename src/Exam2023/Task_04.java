package Exam2023;

import java.util.Scanner;

public class Task_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        double liters = 0;
        double degrees = 0;
        double quantity = 0;
        double sum = 0;
        double quality = 0;
        double totalDegrees = 0;
        for (int i = 1; i <= days; i++) {
            liters = Double.parseDouble(scanner.nextLine());
            degrees = Double.parseDouble(scanner.nextLine());
            sum = liters * degrees;
            quantity += liters;
            quality += sum;
        }
        totalDegrees = quality / quantity;
        System.out.printf("Liter: %.2f\n", quantity);
        System.out.printf("Degrees: %.2f\n", totalDegrees);
        if (totalDegrees < 38) {
            System.out.println("Not good, you should baking!");
        } else if (totalDegrees >= 38 && totalDegrees <= 42) {
            System.out.println("Super!");
        } else if (totalDegrees > 42) {
            System.out.println("Dilution with distilled water!");
        }
    }
}