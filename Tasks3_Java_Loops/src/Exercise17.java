//Given a positive integer n.
//Output the quantity of four-digit numbers whose sum of digits is equal to n.
import java.util.Scanner;

public class Exercise17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int quantity = 0;

        for(int i = 1000; i < 10000; i++) {
            int sum = 0;
            int currentNumber = i;
            while(currentNumber > 0) {
                sum += currentNumber % 10;
                currentNumber /= 10;
            }
            if(sum == n) {
                quantity++;
            }
        }

        System.out.println(quantity);
    }
}
