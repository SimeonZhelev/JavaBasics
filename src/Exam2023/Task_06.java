package Exam2023;

import java.util.Scanner;

public class Task_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int n1 = 0;
        int n2 = 0;
        int n3 = 0;

        for (int i = 1; i <= number ; i++) {
            n1++;
            for (int j = 1; j <=i ; j++) {
                n2++;
                for (int k = 1; k < j; k++) {
                    n3++;
                }
                }
            }
                System.out.println(n1 + " * " + n2 + " * " + n3 + "=" +(n1 * n2 * n3));
    }
}
