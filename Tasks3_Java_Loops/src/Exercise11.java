// Given the positive integer n and the positive floating point number h,
// output to three decimal places the sum of the terms in the sequence whose absolute value is less than h.
// The general term of the sequence is 2 - 10 * sin(3 * i), where 0 <= i <n.
import java.util.Scanner;

public class Exercise11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double h = sc.nextDouble();

        double sum = 0;

        for(int i = 0; i < n; i++) {
            double term = 2 - 10 * Math.sin(3 * i);
            if(Math.abs(term) < h) {
                sum += term;
            }
        }

        System.out.printf("%.3f", sum);
    }
}
