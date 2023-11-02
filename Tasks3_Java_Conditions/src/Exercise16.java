//Given floating point numbers a, b, c, d.
//Output max{d - a, d - b, d - c} to 3 decimal places.

import java.util.Scanner;

class Exercise16 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();
            double d = sc.nextDouble();

            if(d - a >= d - b && d - a >= d - c) {
                System.out.printf("%.3f%n", d - a);
            } else if(d - b >= d - a && d - b >= d - c){
                System.out.printf("%.3f%n", d - b);
            } else {
                System.out.printf("%.3f%n", d - c);
            }

        }
    }
}
