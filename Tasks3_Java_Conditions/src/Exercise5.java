//Given floating point numbers a, b and x.
//Output absolute value of the expression a*x + b to 3 decimal places.

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double x = sc.nextDouble();

            double result = a * x + b;

            if(result < 0) {
                result *= -1;
            }

            System.out.printf("%.3f%n", result);

            System.out.printf("%.3f", result);

            System.out.println(String.format("%.3f", result));

            System.out.print(String.format("%.3f", result));

            System.out.print(result);

            System.out.println(result);

            System.out.println(String.valueOf(result));

            System.out.print(String.valueOf(result));
        }
    }
}