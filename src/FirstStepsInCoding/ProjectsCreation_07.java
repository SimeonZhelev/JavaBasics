package FirstStepsInCoding;

import java.util.Scanner;

public class ProjectsCreation_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int time = 3;
        int prjts = Integer.parseInt(scanner.nextLine());
        int result = time * prjts;

        System.out.printf("The architect %s will need %d hours to complete %d project/s.", name, result,prjts);

    }
}
