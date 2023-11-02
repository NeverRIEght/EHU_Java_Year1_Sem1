//Given integers a and b.
//Are they equal?

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            if(a == b) {
                System.out.println(true);
            } else {
                System.out.println(false);
            }
        }
    }
}
