package NestedLoopsExercises;

import java.util.Scanner;

public class NumberPyramid_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int currentNumber = 1;
        boolean isBigger = false;

        for (int rows = 1; rows <= number ; rows++) {
            for (int columns = 1; columns <= rows ; columns++) {
                if (currentNumber > number){
                    isBigger = true;
                    break;
                }
                System.out.print(currentNumber + " ");
                currentNumber++;
            }
            if (isBigger){
                break;
            }
            System.out.println();
        }
    }
}
