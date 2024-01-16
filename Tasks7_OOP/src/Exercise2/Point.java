package Exercise2;
public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public boolean isBelonging(Line line) {
        return this.y == line.getK() * this.x + line.getB();
    }

    public boolean isBelonging(Ray ray) {
        if(!isBelonging(ray.getLine())) {
            return false;
        } else if(ray.isToRight()) {
            return this.x >= ray.getX0();
        } else {
            return this.x <= ray.getX0();
        }
    }

    public boolean isOver(Line line) {
        return this.y > line.getK() * this.x + line.getB();
    }

    @Override
    public boolean equals(Object obj) {
        final double DELTA = 1.0e-9;
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Point other = (Point) obj;
        return Math.abs(x - other.x) < DELTA && Math.abs(y - other.y) < DELTA;
    }
}
