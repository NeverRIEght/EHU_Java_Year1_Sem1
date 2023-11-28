//Given a digit d > 1.
//Output the product of each digit by d in ascending order.

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputDigit = sc.nextInt();

        String output = "";

        int i = 0;
        while(i < 10) {
            output += (i * inputDigit) + " ";
            i++;
        }
        output = output.trim();
        System.out.println(output);
    }
}
