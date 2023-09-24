package Exam2023;

import java.util.Scanner;

public class Task_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dancers = Integer.parseInt(scanner.nextLine());
        double points = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String location = scanner.nextLine();

        double dancerReward = 0;
        double charity = 0;
        double moneyPerDancer = 0;

        switch (location){
            case "Bulgaria":
                dancerReward = points * dancers;
                if (season.equals("summer")){
                    dancerReward = dancerReward - (dancerReward * 0.05);
                } else if (season.equals("winter")) {
                    dancerReward = dancerReward - (dancerReward * 0.08);
                }
                break;
            case "Abroad":
                double abroadReward = points * dancers;
                dancerReward = abroadReward + (abroadReward * 0.5);
                if (season.equals("summer")){
                    dancerReward = dancerReward - (dancerReward * 0.10);
                } else if (season.equals("winter")) {
                    dancerReward = dancerReward - (dancerReward * 0.15);
                }
                break;
        }
        charity = 0.75 * dancerReward;
        moneyPerDancer = (dancerReward - charity) / dancers;

        System.out.printf("Charity - %.2f%n",charity);
        System.out.printf("Money per dancer - %.2f",moneyPerDancer);
    }
}
