package FirstStepsInCoding;

import java.util.Scanner;
public class InchesToCentimeters_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double inch = Double.parseDouble(scanner.nextLine());
        Double result = inch * 2.54;
        System.out.println(result);
    }
}
