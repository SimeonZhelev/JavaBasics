package ConditionalStatementsExercises;

import java.util.Scanner;

public class Shopping_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int videocardNumber = Integer.parseInt(scanner.nextLine());
        int processorNumber = Integer.parseInt(scanner.nextLine());
        int ramNumber = Integer.parseInt(scanner.nextLine());

        double videoCardPrice = videocardNumber * 250;
        double processorPrice = processorNumber * (videoCardPrice * 0.35);
        double ramPrice = ramNumber * (videoCardPrice * 0.10);

        double finalSum = videoCardPrice + processorPrice + ramPrice;

        if (videocardNumber>processorNumber){
            finalSum = finalSum * 0.85;
        }
        double diff = Math.abs(finalSum - budget);
        if (budget>=finalSum){
            System.out.printf("You have %.2f leva left!", diff);
        } else {
            System.out.printf("Not enough money! You need %.2f leva more!", diff);
        }
    }
}
