//Given a non-negative long integer n.
//Output the number of even digits in it.
import java.util.Scanner;

public class Exercise16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        int evenDigitsCount = 0;

        String output = n + "";

        for(int i = 0; i < output.length(); i++) {
            if((output.charAt(i) + '0') % 2 == 0) {
                evenDigitsCount++;
            }
        }

        System.out.println(evenDigitsCount);
    }
}
