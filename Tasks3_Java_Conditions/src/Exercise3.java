//Given integers a and b.
//Output smaller of them.

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            if(a > b) {
                System.out.println(b);
            } else {
                System.out.println(a);
            }
        }
    }
}
