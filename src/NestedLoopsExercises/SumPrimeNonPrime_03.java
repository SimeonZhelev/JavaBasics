package NestedLoopsExercises;

import java.util.Scanner;

public class SumPrimeNonPrime_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        int sumPrimeNumbers = 0;
        int sumNonPrimeNumbers = 0;

        while(!input.equals("stop")){
            int currentNumber = Integer.parseInt(input);
            boolean isPrime = true;

            if (currentNumber < 0){
                System.out.println("Number is negative.");
                input = scanner.nextLine();
                continue;
            }
            for (int i = 2; i < currentNumber ; i++) {
                if (currentNumber % i == 0){
                    sumNonPrimeNumbers += currentNumber;
                    isPrime = false;
                    break;
                }
            }
            if (isPrime){
                sumPrimeNumbers += currentNumber;
            }
            input = scanner.nextLine();
        }
        System.out.printf("Sum of all prime numbers is: %d%n", sumPrimeNumbers);
        System.out.printf("Sum of all non prime numbers is: %d%n",sumNonPrimeNumbers);
    }
}
