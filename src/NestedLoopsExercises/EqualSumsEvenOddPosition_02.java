package NestedLoopsExercises;

import java.util.Scanner;

public class EqualSumsEvenOddPosition_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());

        for (int currentNumber = firstNumber; currentNumber <= secondNumber ; currentNumber++) {
            int firstDigit = currentNumber / 100000;
            int secondDigit = currentNumber / 10000 % 10;
            int thirdDigit = currentNumber / 1000 % 10;
            int forthDigit = currentNumber / 100 % 10;
            int fifthDigit = currentNumber / 10 % 10;
            int sixthDigit = currentNumber % 10;

            int oddSum = firstDigit + thirdDigit + fifthDigit;
            int evenSum = secondDigit + forthDigit + sixthDigit;

            if (oddSum == evenSum){
                System.out.printf("%d ",currentNumber);
            }
        }
    }
}
