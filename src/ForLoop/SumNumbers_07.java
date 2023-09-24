package ForLoop;

import java.util.Scanner;

public class SumNumbers_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = Integer.parseInt(scanner.nextLine());
        int sumNumbers = 0;

        for (int number = 1; number <= rows; number++ ){
            int value = Integer.parseInt(scanner.nextLine());
            sumNumbers += value;
        }
        System.out.println(sumNumbers);
    }
}
