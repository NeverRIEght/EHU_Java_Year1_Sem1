//Given floating point numbers a and b and an integer n, where a < b, n > 1.
//Output values of a function f(x) to 3 decimal places on the segment [a, b] in n equidistant points.
//f(x) = 1 + 2 * sin(x).

import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        int n = sc.nextInt();


        double step = (b - a) / (n - 1);
        String output = "";


        int i = 0;
        while(i < n) {
            double x = a + i * step;
            double Fx = 1 + 2 * Math.sin(x);
            output += String.format("%.3f", Fx) + " ";
            i++;
        }

        output = output.trim();
        System.out.println(output);
    }
}
