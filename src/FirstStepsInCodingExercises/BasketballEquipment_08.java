package FirstStepsInCodingExercises;

import java.util.Scanner;

public class BasketballEquipment_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int yearTax = Integer.parseInt(scanner.nextLine());

        double basketballshoes = yearTax - (yearTax * 0.4);
        double suitPrice = basketballshoes - (basketballshoes * 0.2);
        double ballPrice = suitPrice /4;
        double accesoriesPrice = ballPrice /5;

        double totalSum = yearTax + basketballshoes + suitPrice + ballPrice + accesoriesPrice;

        System.out.println(totalSum);

    }
}
