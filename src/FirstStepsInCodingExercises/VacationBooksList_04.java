package FirstStepsInCodingExercises;

import java.util.Scanner;

public class VacationBooksList_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pages = Integer.parseInt(scanner.nextLine());
        int pagesPerHour = Integer.parseInt(scanner.nextLine());
        int numberDays = Integer.parseInt(scanner.nextLine());

        int time = pages / pagesPerHour;
        int numberDaysCount = time / numberDays;

        System.out.println(numberDaysCount);
    }
}
