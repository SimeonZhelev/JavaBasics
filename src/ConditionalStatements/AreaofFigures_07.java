package ConditionalStatements;

import java.util.Scanner;

public class AreaofFigures_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String form = scanner.nextLine();
        double area = 0;
        if (form.equals("square")) {
            double side = Double.parseDouble(scanner.nextLine());
            area = side *side;
        } else if (form.equals("rectangle")) {
            double length = Double.parseDouble(scanner.nextLine());
            double width = Double.parseDouble(scanner.nextLine());
            area = length * width;
        } else if (form.equals("circle")) {
            double radius = Double.parseDouble(scanner.nextLine());
            area = Math.PI * radius * radius;
        } else if (form.equals("triangle")) {
            double base = Double.parseDouble(scanner.nextLine());
            double height = Double.parseDouble(scanner.nextLine());
            area = base * height / 2;
        }
        System.out.printf("%.3f",area);
        }
    }
