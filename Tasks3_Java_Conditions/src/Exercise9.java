//Given two points on the plain A(x1, y1) and B(x2, y2).
//Output 0, if they are equidistant from the origin,
//1 if point A is closer than point B, and -1 otherwise.

import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            double x1 = sc.nextDouble();
            double y1 = sc.nextDouble();
            double x2 = sc.nextDouble();
            double y2 = sc.nextDouble();

            double distanceFrom0ToPointA = Math.sqrt(Math.pow(x1, 2) + Math.pow(y1, 2));
            double distanceFrom0ToPointB = Math.sqrt(Math.pow(x2, 2) + Math.pow(y2, 2));

            if(distanceFrom0ToPointA == distanceFrom0ToPointB) {
                System.out.println(0);
            } else if(distanceFrom0ToPointA < distanceFrom0ToPointB) {
                System.out.println(1);
            } else {
                System.out.println(-1);
            }
        }
    }
}