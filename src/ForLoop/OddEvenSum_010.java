package ForLoop;

import java.util.Scanner;

public class OddEvenSum_010 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = Integer.parseInt(scanner.nextLine());
        int numbersSumOfEvenPositions = 0;
        int numbersSumOfOddPositions = 0;
        for (int position = 1; position <= rows ; position++) {
            int number = Integer.parseInt(scanner.nextLine());
            if (position %2 == 0){
                numbersSumOfEvenPositions += number;
            }else {
                numbersSumOfOddPositions += number;
            }
        }
        if (numbersSumOfEvenPositions == numbersSumOfOddPositions){
            System.out.println("Yes");
            System.out.println("Sum = " + numbersSumOfEvenPositions);
        }else{
            System.out.println("No");
            System.out.println("Diff = " + Math.abs(numbersSumOfEvenPositions - numbersSumOfOddPositions));
        }
    }
}
