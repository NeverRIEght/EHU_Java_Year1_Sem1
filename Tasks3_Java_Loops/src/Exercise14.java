//Given a positive integer n.
//Output divisors of n in ascending order.
import java.util.Scanner;

public class Exercise14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String output = "";

        for(int i = 1; i <= n; i++) {
            if(n % i == 0) {
                output += i + " ";
            }
        }

        System.out.printf(output);
    }
}
