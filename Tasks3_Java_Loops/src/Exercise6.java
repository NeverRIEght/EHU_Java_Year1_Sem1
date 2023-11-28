//Given a sequence of integers, containing the only number 0 at the end.
//Count the quantity of odd integers.

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nextNumber = sc.nextInt();

        int numberOfOdd = 0;

        while(nextNumber != 0) {
            if(nextNumber % 2 != 0) {
                numberOfOdd++;
            }
            nextNumber = sc.nextInt();
        }
        System.out.println(numberOfOdd);
    }
}
