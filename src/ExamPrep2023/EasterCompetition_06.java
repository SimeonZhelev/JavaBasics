package ExamPrep2023;

import java.util.Scanner;

public class EasterCompetition_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countKozunatsi = Integer.parseInt(scanner.nextLine());//брой на козунаци
        //за всеки един козунак:
        //повтаряме (for): 1. получаваме име на пекар    2. получаваме оценки за козунака
        //начало: първия козунак (1)
        //край: последния козунак (countKozunatsi)
        //промяна: отиваме на следващия козунак
        String bestBaker = ""; //името на най-добрия пекар
        int pointsBestBaker = 0; //точките на най-добрия пекар

        for (int kozunak = 1; kozunak <= countKozunatsi; kozunak++) {
            //1. въвеждаме пекаря
            String baker = scanner.nextLine();
            int totalPoints = 0; //общ брой точки за всеки пекар
            //2. въвеждаме оценки от дегустация
            //повтаряме (while): въвеждаме оценки
            //stop: input == "Stop"
            //continue: input != "Stop"
            String input = scanner.nextLine(); //число под формата на текст ("9") или "Stop"
            while (!input.equals("Stop")) {
                //input - число (оценка) под формата на текст - "10"
                int grade = Integer.parseInt(input);
                totalPoints += grade;
                input = scanner.nextLine();
            }
            //знам кой е пекаря (baker) и колко точки е получил (totalPoints)
            System.out.printf("%s has %d points.%n", baker, totalPoints);
            //проверка дали този пекар е най-добър
            if (totalPoints > pointsBestBaker) {
                bestBaker = baker;
                pointsBestBaker = totalPoints;
                System.out.printf("%s is the new number 1!%n", bestBaker);
            }
        }
        System.out.printf("%s won competition with %d points!", bestBaker, pointsBestBaker);
    }
}
