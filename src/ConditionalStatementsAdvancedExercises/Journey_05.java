package ConditionalStatementsAdvancedExercises;

import java.util.Scanner;

public class Journey_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String destination = "";
        String accommodation = "";
        double spendMoney = 0;

        if (budget <=100 && season.equals("summer")){
            destination = "Bulgaria";
            accommodation = "Camp";
            spendMoney = budget * 0.3;
        }else if (budget<=100 && season.equals("winter")){
            destination = "Bulgaria";
            accommodation = "Hotel";
            spendMoney = budget * 0.7;
        }else if(budget<=1000 && season.equals("summer")){
            destination = "Balkans";
            accommodation = "Camp";
            spendMoney = budget * 0.4;
        }else if (budget<=1000 && season.equals("winter")){
            destination = "Balkans";
            accommodation = "Hotel";
            spendMoney = budget * 0.8;
        }else if (budget>1000 && season.equals("summer")||season.equals("winter")){
            destination = "Europe";
            accommodation = "Hotel";
            spendMoney = budget * 0.9;
        }
        System.out.printf("Somewhere in %s %n",destination );
        System.out.printf("%s - %.2f",accommodation,spendMoney);
    }
}
