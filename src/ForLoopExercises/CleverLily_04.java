package ForLoopExercises;

import java.util.Scanner;

public class CleverLily_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = Integer.parseInt(scanner.nextLine());
        double priceWasher = Double.parseDouble(scanner.nextLine());
        int priceToy = Integer.parseInt(scanner.nextLine());
        double sum = 0;
        int countToys = 0;

        /*for -> минаваме през всяка от годините(рожден ден)
        -> за четните получава пари
        -> за нечетните получава играчка
         */
        for (int currentAge = 1; currentAge<=age ; currentAge++) {
            //проверка дали годината е четна или нечетна
            if (currentAge%2==0){
                sum +=(currentAge * 5 -1);
            } else{
                countToys++;
            }
        }
        // към досегашната сума добавяме парите за играчките
        sum+= countToys * priceToy;

        double diff = Math.abs(priceWasher-sum);

        if (sum >= priceWasher){
            System.out.printf("Yes! %.2f", diff);
        }else{
            System.out.printf("No! %.2f",diff);
        }
    }
}
