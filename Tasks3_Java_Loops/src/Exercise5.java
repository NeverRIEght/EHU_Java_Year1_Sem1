//Given a sequence of integers, containing the only number 0 at the end.
//Output its sum.

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nextNumber = sc.nextInt();

        int sum = 0;

        while(nextNumber != 0) {
            sum += nextNumber;
            nextNumber = sc.nextInt();
        }
        System.out.println(sum);
    }
}
