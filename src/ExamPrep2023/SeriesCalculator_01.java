package ExamPrep2023;

import java.util.Scanner;

public class SeriesCalculator_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1. входни данни
        String serialName = scanner.nextLine(); //име на сериал
        int countSeasons = Integer.parseInt(scanner.nextLine()); //брой сезони
        int countEpisodes = Integer.parseInt(scanner.nextLine()); //брой епизоди в сезон
        double timePerEpisode = Double.parseDouble(scanner.nextLine()); //времетраене на епизод
        double timeForAds = 0.2 * timePerEpisode;  //времетраена на реклами
        //времетраене на епизод с рекламите
        double totalTimeForEpisode = timePerEpisode + timeForAds;
        //допълнително време за специални епизоди
        double additionalTime = countSeasons * 10;

        double totalTime = (countSeasons * countEpisodes * totalTimeForEpisode) + additionalTime;

        System.out.printf("Total time needed to watch the %s series is %.0f minutes.", serialName, Math.floor(totalTime));
    }
}
