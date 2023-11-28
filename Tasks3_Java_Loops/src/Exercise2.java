//Given a digit d.
//Output digits from d to 0 inclusively.

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lastDigit = sc.nextInt();

        String output = "";

        int i = lastDigit;
        while(i >= 0) {
            output += i + " ";
            i--;
        }

        System.out.println(output.trim());
    }
}
