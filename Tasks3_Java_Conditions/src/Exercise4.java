//Given integers a and b.
//Output the number whose square is less or equal the other one.

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            if(Math.pow(a, 2) <= Math.pow(b, 2)) {
                System.out.println(a);
            } else if(Math.pow(b, 2) <= Math.pow(a, 2)) {
                System.out.println(b);
            } else {
                System.out.println("Error");
            }
        }
    }
}