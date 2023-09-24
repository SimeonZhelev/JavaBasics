package WhileLoop;

import java.util.Scanner;

public class AccountBalance_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sum = 0;
        String command = scanner.nextLine();
        while (!command.equals("NoMoreMoney")) {
            double fee = Double.parseDouble(command);
            if (fee < 0) {
                System.out.println("Invalid operation!");
                break;
            }
            System.out.printf("Increase: %.2f%n", fee);
            sum += fee;
            command = scanner.nextLine();
        }
        System.out.printf("Total: %.2f%n", sum);
    }
}