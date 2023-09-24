package WhileLoopExercises;

import java.util.Scanner;

public class Vacation_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double neededMoney = Double.parseDouble(scanner.nextLine());
        double haveMoney = Double.parseDouble(scanner.nextLine());
        int countSpend = 0;
        int countDays = 0;
        while (haveMoney < neededMoney){
            if (countSpend == 5){
                break;
            }
            String command = scanner.nextLine();
            double currentSum = Double.parseDouble(scanner.nextLine());
            countDays++;
            if (command.equals("spend")){
                countSpend++;
                haveMoney -= currentSum;
            } else if (command.equals("save")) {
                haveMoney += currentSum;
                countSpend = 0;
            }
            if (haveMoney < 0){
                haveMoney = 0;
            }
            }
            if (countSpend == 5){
                System.out.println("You can't save the money.");
                System.out.println(countDays);
            }else{
                System.out.printf("You saved the money for %d days.",countDays);
            }
        }
    }