//Given integers m and n, where m < n.
//Output even numbers between m and n inclusively in descending order.

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        String output = "";

        int i = n;
        while(i >= m) {
            if(i % 2 == 0) {
                output += i + " ";
            }
            i--;
        }
        output = output.trim();
        System.out.println(output);
    }
}
