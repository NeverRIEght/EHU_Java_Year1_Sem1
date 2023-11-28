//Given a non-negative integer n.
//Output the factorial of n.
import java.util.Scanner;

public class Exercise12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        double factorial = 1;

        for(int i = 0; i < n; i++) {
            factorial *= i + 1;
        }

        System.out.printf("%.0f", factorial);
    }
}
