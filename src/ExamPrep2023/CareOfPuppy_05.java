package ExamPrep2023;

import java.util.Scanner;

public class CareOfPuppy_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int preparedFoodInKg = Integer.parseInt(scanner.nextLine()); //подготвена храна в кг
        int preparedFoodInGrams = preparedFoodInKg * 1000; //подготвена храна в грамове
        int totalEatenFood = 0; //общо изядено количество
        //повтаряме (while): въвеждаме изядени грамове
        //stop: входни данни == "Adopted"
        //continue: входни данни != "Adopted"
        String input = scanner.nextLine();
        //входни данни = "Adopted" или число под формата на текст "120"
        while (!input.equals("Adopted")) {
            //input = "120" -> колко грамове е изяло кучето
            int eatenGrams = Integer.parseInt(input); //изядени грамове за хранене
            totalEatenFood += eatenGrams;

            input = scanner.nextLine();
        }
        //осиновено -> знам какво количество е изяло: totalEatenFood
        //проверка дали предвидената храна е достатъчна
        if (preparedFoodInGrams >= totalEatenFood) {
            //достатъчна
            int leftGrams = preparedFoodInGrams - totalEatenFood;
            System.out.printf("Food is enough! Leftovers: %d grams.", leftGrams);
        } else {
            //preparedFoodInGrams < totalEatenFood -> не е достатъчна
            int needGrams = totalEatenFood - preparedFoodInGrams;
            System.out.printf("Food is not enough. You need %d grams more.", needGrams);
        }
    }
}
