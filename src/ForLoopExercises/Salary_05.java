package ForLoopExercises;

import java.util.Scanner;

public class Salary_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tabs = Integer.parseInt(scanner.nextLine());
        int salary = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <=tabs ; i++) {
            String website = scanner.nextLine();

            if (salary <= 0){
                System.out.println("You have lost your salary.");
                break;
            }

        }


    }
}
