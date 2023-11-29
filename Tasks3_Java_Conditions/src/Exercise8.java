//Given a floating point number a.
//If a number is not negative, then output its square to 3 decimal places,
//otherwise its fourth power to 3 decimal places.

import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            double a = sc.nextDouble();

            if(a >= 0) {
                System.out.printf("%.3f%n", a*a);
            } else {
                System.out.printf("%.3f%n", a*a*a*a);
            }
        }
    }
}