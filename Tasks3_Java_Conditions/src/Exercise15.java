//Given integers a, b, c, d.
//Output max{min(a, b), min(c, d)}.

import java.util.Scanner;

class Exercise15 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();

            int smallestFromAB;
            int smallestFromCD;

            if(a <= b) {
                smallestFromAB = a;
            } else {
                smallestFromAB = b;
            }

            if(c <= d) {
                smallestFromCD = c;
            } else {
                smallestFromCD = d;
            }

            if(smallestFromAB >= smallestFromCD) {
                System.out.println(smallestFromAB);
            } else {
                System.out.println(smallestFromCD);
            }
        }
    }
}
