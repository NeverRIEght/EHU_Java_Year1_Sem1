//Given a positive integer n.
//Output the sum 1/1 + 1/2 + 1/3 +... + 1/n to 3 decimal places.

import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        double sum = 0;

        int i = 1;
        while (i <= n){
            sum += 1.0 / i;
            i++;
        }

        System.out.printf("%.3f", sum);
    }
}
