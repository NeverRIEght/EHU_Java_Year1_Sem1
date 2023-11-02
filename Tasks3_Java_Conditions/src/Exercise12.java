//Given the integers a and b, if a < b,
//exchange their values one for the other,
//and output a and then b.
//Format of an input line is a b.

import java.util.Scanner;

class Exercise12 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            //do not change the code above

            if(a < b) {
                a = a ^ b;
                b = a ^ b;
                a = a ^ b;
            }

            //do not change the code below
            System.out.printf("%d %d", a, b);
        }
    }
}
