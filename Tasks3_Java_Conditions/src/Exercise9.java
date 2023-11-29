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

            double distanceFrom0ToPointA = x1 * x1 + y1 * y1;

            double value = distanceFrom0ToPointA;

            if (value == 0 || value == 1) {
                distanceFrom0ToPointA = value;
            } else {
                double approx = value / 2.0;
                double lastApprox = 0.0;

                while (approx != lastApprox) {
                    lastApprox = approx;
                    approx = 0.5 * (approx + value / approx);
                }

                distanceFrom0ToPointA = approx;
            }

            double distanceFrom0ToPointB = x2 * x2 + y2 * y2;

            value = distanceFrom0ToPointB;

            if (value == 0 || value == 1) {
                distanceFrom0ToPointB = value;
            } else {
                double approx = value / 2.0;
                double lastApprox = 0.0;

                while (approx != lastApprox) {
                    lastApprox = approx;
                    approx = 0.5 * (approx + value / approx);
                }

                distanceFrom0ToPointB = approx;
            }

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