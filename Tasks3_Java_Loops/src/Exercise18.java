//Given a positive long integer n, containing even quantity of digits in its record.
//Separate number n to the left and right parts with equal quantity of digits.
import java.util.Scanner;

public class Exercise18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        String number = String.valueOf(n);
        String firstPart = number.substring(0, number.length() / 2);
        String secondPart = number.substring(number.length() / 2);

        System.out.println(Integer.parseInt(firstPart) + " " + Integer.parseInt(secondPart));
    }
}
