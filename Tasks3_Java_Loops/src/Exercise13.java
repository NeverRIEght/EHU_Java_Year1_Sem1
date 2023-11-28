//Given two integers m and n, where 33 <= m < n < 127.
//Output ASCII symbols with codes from m to n inclusively.
import java.util.Scanner;

public class Exercise13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        String output = "";

        for(int i = m; i <= n; i++) {
            char symbol = (char) i;
            output += symbol + " ";
        }

        System.out.printf(output);
    }
}
