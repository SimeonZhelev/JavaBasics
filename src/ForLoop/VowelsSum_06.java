package ForLoop;

import java.util.Scanner;

public class VowelsSum_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        int sumOfVowels = 0;

        for (int i = 0; i < text.length(); i++){

            char currentSymbol = text.charAt(i);

            switch (currentSymbol){
                case 'a':
                    sumOfVowels +=1;
                    break;
                case 'e':
                    sumOfVowels +=2;
                    break;
                case 'i':
                    sumOfVowels +=3;
                    break;
                case 'o':
                    sumOfVowels +=4;
                    break;
                case 'u':
                    sumOfVowels +=5;
                    break;
            }
        }
        System.out.println(sumOfVowels);
    }
}
