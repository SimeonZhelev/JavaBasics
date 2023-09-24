package ForLoop;

import java.util.Scanner;

public class LeftandRightSum_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int sumFirstPair = 0;
        int sumSecondPair = 0;
        for (int i = 1; i <= n * 2; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            if (i <= n){
                sumFirstPair += number;
            }else {
                sumSecondPair += number;
            }
        }

        if (sumFirstPair == sumSecondPair){
            System.out.printf("Yes, sum = %d", sumFirstPair);
        }else {
            System.out.printf("No, diff = %d", Math.abs(sumFirstPair - sumSecondPair));
        }


    }
}


