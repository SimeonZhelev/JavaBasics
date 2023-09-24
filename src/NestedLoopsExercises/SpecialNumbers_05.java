package NestedLoopsExercises;

import java.util.Scanner;

public class SpecialNumbers_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 1111; i <=9999 ; i++) {
            int firstDigit = i/1000;
            int secondDigit = i/100 % 10;
            int thirdDigit = i/10 % 10;
            int forthDigit = i % 10;

            boolean checkfirst = number % firstDigit == 0;
            boolean checksecond = secondDigit != 0 && number % secondDigit == 0;
            boolean checkthird = thirdDigit != 0 && number % thirdDigit == 0;
            boolean checkforth = forthDigit != 0 && number % forthDigit == 0;

            if ( checkfirst && checksecond && checkthird && checkforth){
                System.out.printf("%d ",i);
            }

        }

    }
}
