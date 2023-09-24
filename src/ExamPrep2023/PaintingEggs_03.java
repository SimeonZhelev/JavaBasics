package ExamPrep2023;

import java.util.Scanner;

public class PaintingEggs_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //входни данни
        String size = scanner.nextLine(); //"Large", "Medium" или "Small"
        String color = scanner.nextLine(); //"Red", "Green" или "Yellow"
        int count = Integer.parseInt(scanner.nextLine()); //брой партиди
        //1. цена за 1 партида -> зависи от size и color
        int pricePerOne = 0; //цена за 1 партида

        if (size.equals("Large")) {
            //големи яйца
            //проверка в какъв цвят
            if (color.equals("Red")) {
                //големи червени яйца
                pricePerOne = 16;
            } else if (color.equals("Green")) {
                // големи зелени яйца
                pricePerOne = 12;
            } else if (color.equals("Yellow")) {
                //големи жълти яйца
                pricePerOne = 9;
            }
        } else if (size.equals("Medium")) {
            //средни яйца
            //проверка в какъв цвят
            if (color.equals("Red")) {
                //средни червени яйца
                pricePerOne = 13;
            } else if (color.equals("Green")) {
                //средни зелени яйца
                pricePerOne = 9;
            } else if (color.equals("Yellow")) {
                //средни жълти яйца
                pricePerOne = 7;
            }
        } else if (size.equals("Small")) {
            //малки яйца
            //проверка в какъв цвят
            if (color.equals("Red")) {
                //малки червени яйца
                pricePerOne = 9;
            } else if (color.equals("Green")) {
                //малки зелени яйца
                pricePerOne = 8;
            } else if (color.equals("Yellow")) {
                //малки жълти яйца
                pricePerOne = 5;
            }
        }
        //знаем колко струва 1 партида от въведените яйца
        double totalPrice = count * pricePerOne; //общ сума за плащане
        double expenses = 0.35 * totalPrice; //сума за разходи
        //крайна сума
        double finalSum = totalPrice - expenses;
        System.out.printf("%.2f leva.", finalSum);
    }
}
