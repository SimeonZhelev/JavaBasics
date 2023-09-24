package ExamPrep2023;

import java.util.Scanner;

public class Balls_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countBalls = Integer.parseInt(scanner.nextLine()); //брой топки

        int totalPoints = 0;        //общ брой натрупани точки
        int countRedBalls = 0;      //брой червени топки
        int countOrangeBalls = 0;   //брой орнжеви топки
        int countYellowBalls = 0;   //брой жълти топки
        int countWhiteBalls = 0;    //брой бели топки
        int countOtherBalls = 0;    //брой на топки с други цветове, извън изброените
        int countBlackBalls = 0;    //брой черни топки


        for (int ball = 1; ball <= countBalls; ball++) {
            String color = scanner.nextLine();
            //"red", "orange", "yellow", "white", "black"
            switch (color) {
                case "red":
                    //топката е червена
                    totalPoints += 5;
                    countRedBalls++;
                    break;
                case "orange":
                    //топката е оранжева
                    totalPoints += 10;
                    countOrangeBalls++;
                    break;
                case "yellow":
                    //топката е жълта
                    totalPoints += 15;
                    countYellowBalls++;
                    break;
                case "white":
                    //топката е бяла
                    totalPoints += 20;
                    countWhiteBalls++;
                    break;
                case "black":
                    //топката е черна
                    totalPoints /= 2;
                    countBlackBalls++;
                    break;
                default:
                    //друг цвят топка
                    countOtherBalls++;
                    break;
            }
        }
        System.out.println("Total points: " + totalPoints);
        System.out.println("Red balls: " + countRedBalls);
        System.out.println("Orange balls: " + countOrangeBalls);
        System.out.println("Yellow balls: " + countYellowBalls);
        System.out.println("White balls: " + countWhiteBalls);
        System.out.println("Other colors picked: " + countOtherBalls);
        System.out.println("Divides from black balls: " + countBlackBalls);
    }
}
