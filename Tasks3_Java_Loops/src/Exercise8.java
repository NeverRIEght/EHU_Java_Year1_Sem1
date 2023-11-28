//Given floating point numbers a, b, h, where a < b, h > 0.
//Output values of a function f(x) to 3 decimal places on the half-interval [a, b) with step h.
//f(x) = x if x > 2, otherwise 2 * x + 1.

import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double h = sc.nextDouble();

        String output = "";

        double x = a;
        while (x < b) {
            double Fx = x > 2 ? x : 2 * x + 1;
            output += String.format("%.3f", Fx) + " ";
            x += h;
        }

        System.out.println(output);
    }
}
