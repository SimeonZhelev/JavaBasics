package WhileLoopExercises;

public class Demo {
    public static void main(String[] args) {
        int number = 1;

        while (number < 15) {
            number++;

            if (number % 2 == 1) {
                continue;
            }
            System.out.println(number);
        }
    }
}