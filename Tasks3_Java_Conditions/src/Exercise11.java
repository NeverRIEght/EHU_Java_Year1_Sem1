//Given integer numbers a, b, c, and a divisor k != 0.
//Output true instead of a corresponding number if it is the multiple of the number k,
//and false otherwise.
//Input data are correct.

import java.util.Scanner;

public class Exercise11 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int k = sc.nextInt();

            System.out.print(a % k == 0 ? "true " : "false ");
            System.out.print(b % k == 0 ? "true " : "false ");
            System.out.print(c % k == 0 ? "true" : "false");
        }
    }
}