package WhileLoopExercises;

import java.util.Scanner;

public class Coins_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = Double.parseDouble(scanner.nextLine());
        double totalSumCoins = Math.floor(sum * 100);
        int countCoins = 0;
        while (totalSumCoins > 0){

            if (totalSumCoins >= 200){
                countCoins++;
                totalSumCoins -= 200;
            } else if (totalSumCoins >= 100) {
                countCoins++;
                totalSumCoins -= 100;
            } else if (totalSumCoins >= 50) {
                countCoins++;
                totalSumCoins -= 50;
            } else if (totalSumCoins >= 20) {
                countCoins++;
                totalSumCoins -= 20;
            } else if (totalSumCoins >= 10) {
                countCoins++;
                totalSumCoins -= 10;
            } else if (totalSumCoins >= 5) {
                countCoins++;
                totalSumCoins -= 5;
            }else if (totalSumCoins >= 2) {
                countCoins++;
                totalSumCoins -= 2;
            } else if (totalSumCoins >= 1) {
                countCoins++;
                totalSumCoins -= 1;
            }
        }
        System.out.println(countCoins);
    }
}
