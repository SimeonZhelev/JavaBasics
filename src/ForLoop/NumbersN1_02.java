package ForLoop;

import java.util.Scanner;

public class NumbersN1_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        for(int i=number; i>=1; i--){
            System.out.println(i);
        }
    }
}
// Как работи фор цикъл?
// 1. Декларираме старт - променливата (в случая int = number)
// 2. Проверка дали сме достигнали края на цикъла ( изпълнено ли е i>=1)
// 3. Изпълнение на блока от код в тялото на цикъла ( циклично изпълняване на принт)
// 4. Промяна на стойността на променливата (когато i>=1 излизаме от тялото на цикъла)