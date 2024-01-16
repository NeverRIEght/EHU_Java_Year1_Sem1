package Exercise2;

public class Ray {
    private final double x0;
    private final double y0;
    private final Line line;
    private final boolean toRight;
    public Ray(double x0, Line line, boolean toRight) {
        this.x0 = x0;
        this.line = line;
        this.y0 = line.getK() * x0 + line.getB();
        this.toRight = toRight;
    }

    public Point getOrigin() {
        return new Point(x0, y0);
    }

    public double getX0() {
        return x0;
    }

    public double getY0() {
        return y0;
    }

    public Line getLine() {
        return line;
    }

    public boolean isToRight() {
        return toRight;
    }
}
