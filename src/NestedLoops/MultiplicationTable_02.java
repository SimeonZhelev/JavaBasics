package NestedLoops;

public class MultiplicationTable_02 {
    public static void main(String[] args) {
        for (int number = 1; number <= 10 ; number++) {
            for (int number2 = 1; number2 <=10 ; number2++) {
                System.out.println(number + " * " + number2 + " = " + (number * number2));
            }
        }
    }
}
