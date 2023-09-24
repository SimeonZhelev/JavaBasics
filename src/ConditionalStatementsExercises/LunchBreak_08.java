package ConditionalStatementsExercises;

import java.util.Scanner;

public class LunchBreak_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int duration = Integer.parseInt(scanner.nextLine());
        int lunchBreak = Integer.parseInt(scanner.nextLine());

        double timeForEating = lunchBreak / 8.0;
        double timeForRest = lunchBreak / 4.0;

        double timeForWatch = lunchBreak - timeForEating - timeForRest;

        if (timeForWatch >= duration) {
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", name, Math.ceil(timeForWatch - duration));
        } else {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", name, Math.ceil(duration - timeForWatch));
        }
    }
}