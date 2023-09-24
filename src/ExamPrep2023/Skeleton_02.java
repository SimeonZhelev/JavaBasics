package ExamPrep2023;

import java.util.Scanner;

public class Skeleton_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1. входни данни
        int minutes = Integer.parseInt(scanner.nextLine()); //минути за подобряване -> 2 min
        int seconds = Integer.parseInt(scanner.nextLine()); //секунди за подобряване -> 12 sec
        double length = Double.parseDouble(scanner.nextLine());
        int secondsPer100Meters = Integer.parseInt(scanner.nextLine());
        //2. времето, което трябва да подобрим в секунди
        int timeRecordInSeconds = minutes * 60 + seconds; //2 min 12 sec -> 132 sec
        //3. време за забързваме
        double countSpeed = length / 120; //колко пъти се забързваме
        double timeSpeed = countSpeed * 2.5; //времето на забързваме
        //общо време, за което преминава през разстоянието
        double totalTimeInSeconds = (length / 100) * secondsPer100Meters - timeSpeed;
        //проверка дали времето подобрява рекорда
        if (totalTimeInSeconds <= timeRecordInSeconds) {
            System.out.println("Marin Bangiev won an Olympic quota!");
            System.out.printf("His time is %.3f.", totalTimeInSeconds);
        } else {
            //timeRecordInsSeconds < totalTimeInSeconds
            double needSeconds = totalTimeInSeconds - timeRecordInSeconds;
            System.out.printf("No, Marin failed! He was %.3f second slower.", needSeconds);
        }
    }
}
