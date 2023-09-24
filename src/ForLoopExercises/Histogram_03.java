package ForLoopExercises;

import java.util.Scanner;

public class Histogram_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n =Integer.parseInt(scanner.nextLine());
        // създаваме променливи за броя числа в конкретен диапазон
        int countP1 = 0;
        int countP2 = 0;
        int countP3 = 0;
        int countP4 = 0;
        int countP5 = 0;
        //правим цикъл и прочитам n на брой числа
        for (int i = 1; i <=n ; i++) {
            int currentNum = Integer.parseInt(scanner.nextLine());
            //проверяваме в кой диапазон попада текущото число
            if (currentNum<200){
                countP1++;
            } else if (currentNum<400) {
                countP2++;
            } else if (currentNum<600) {
                countP3++;
            } else if (currentNum<800) {
                countP4++;
            } else {
                countP5++;
            }
        }
        double p1Percent = (countP1 * 1.0 /n) *100;
        double p2Percent = (countP2 * 1.0 /n) *100;
        double p3Percent = (countP3 * 1.0 /n) *100;
        double p4Percent = (countP4 * 1.0 /n) *100;
        double p5Percent = (countP5 * 1.0 /n) *100;
        System.out.printf("%.2f%%%n",p1Percent);
        System.out.printf("%.2f%%%n",p2Percent);
        System.out.printf("%.2f%%%n",p3Percent);
        System.out.printf("%.2f%%%n",p4Percent);
        System.out.printf("%.2f%%%n",p5Percent);
    }
}
