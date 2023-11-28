//Given a positive integer n.
//Output the sum of squares of numbers from 1 to n inclusively.

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sumOfSquares = 0;

        int i = 0;
        while(i <= n) {
            sumOfSquares += Math.pow(i, 2);
            i++;
        }
        System.out.println(sumOfSquares);
    }
}
