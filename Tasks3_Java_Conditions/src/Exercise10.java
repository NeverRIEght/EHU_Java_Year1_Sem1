//Given floating point numbers a, b and c.
//Count quantity of negative numbers among them.

import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();

            int negativeNumbersCounter = 0;

            if(a < 0) {
                negativeNumbersCounter++;
            }
            if(b < 0) {
                negativeNumbersCounter++;
            }
            if(c < 0) {
                negativeNumbersCounter++;
            }

            System.out.println(negativeNumbersCounter);
        }
    }
}