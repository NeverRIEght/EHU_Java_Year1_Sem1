//Given three floating point numbers a, b, c.
//Output the sum of the biggest and smallest numbers among them to 3 decimal places.

import java.util.Scanner;

class Exercise14 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();

            double largest;
            double smallest;

            if(a >= b && a >= c) {
                largest = a;
            } else if(b >= a && b >= c) {
                largest = b;
            } else {
                largest = c;
            }

            if(a <= b && a <= c) {
                smallest = a;
            } else if(b <= a && b <= c) {
                smallest = b;
            } else {
                smallest = c;
            }

            System.out.printf("%.3f%n", smallest + largest);
        }
    }
}
