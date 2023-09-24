package ForLoopExercises;

import java.util.Scanner;

public class TennisRanklist_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countTournaments = Integer.parseInt(scanner.nextLine());
        int startingPoints = Integer.parseInt(scanner.nextLine());
        int countWins = 0;
        int allTournamentsPoints = 0;
        for (int i = 1; i <= countTournaments ; i++) {
            String currentStage = scanner.nextLine();
            if (currentStage.equals("W")){
                countWins++;
                allTournamentsPoints += 2000;
            } else if (currentStage.equals("F")) {
                allTournamentsPoints += 1200;
            } else if (currentStage.equals("SF")) {
                allTournamentsPoints += 720;
            }
        }
        int finalPoints = allTournamentsPoints + startingPoints;
        int averagePoints = allTournamentsPoints / countTournaments;
        double percentWins = (countWins * 1.0 / countTournaments) * 100;

        System.out.printf("Final points: %d%n",finalPoints);
        System.out.printf("Average points: %d%n",averagePoints);
        System.out.printf("%.2f%%",percentWins);
    }
}