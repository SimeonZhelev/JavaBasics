package NestedLoops;

import java.util.Scanner;

public class Combinations_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int count = 0;
        for (int first = 0; first <=n ; first++) {
            for (int second = 0; second <=n ; second++) {
                for (int third = 0; third <=n ; third++) {
                    int sum = first + second + third;
                    if (sum == n){
                        count ++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
