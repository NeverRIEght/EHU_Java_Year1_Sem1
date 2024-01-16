package Exercise2;

public class Line {
    //y = k * x + b
    private double k;
    private double b;

    public double ordinate(double x) {
        return k * x + b;
    }

    public Point intersection(Line line) {
        return null;
    }

    public Point intersection(Ray ray) {
        return null;
    }
}
