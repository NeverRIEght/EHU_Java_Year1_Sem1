//Given integers a, b and c.
//Are they equal?

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            if(a == b && b == c) {
                System.out.println(true);
            } else {
                System.out.println(false);
            }
        }
    }
}



