//Given a non-negative long integer n.
//Output its most significant digit.
import java.util.Scanner;

public class Exercise15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        String output = n + "";
        output = output.charAt(0) + "";

        System.out.printf(output);
    }
}
