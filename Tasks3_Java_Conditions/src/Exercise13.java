//Given integers h and m, where h is current number of hours, m is minutes.
//Output whether values h and m are valid, i.e. 0 <= h < 24, 0 <= m < 60.

import java.util.Scanner;

class Exercise13 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int h = sc.nextInt();
            int m = sc.nextInt();

            if(h >= 0 && h < 24 && m >= 0 && m < 60) {
                System.out.println(true);
            } else {
                System.out.println(false);
            }
        }
    }
}
