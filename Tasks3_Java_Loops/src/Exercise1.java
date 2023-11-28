//Given a digit d.
//Output digits from 0 to d inclusively.

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lastDigit = sc.nextInt();

        String output = "";

        int i = 0;
        while(i <= lastDigit) {
            output += i + " ";
            i++;
        }

        System.out.println(output.trim());
    }
}
