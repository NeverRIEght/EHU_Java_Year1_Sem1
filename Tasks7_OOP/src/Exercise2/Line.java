package Exercise2;

public class Line {
    //y = k * x + b
    private double k;
    private double b;

    public Line(double k, double b) {
        this.k = k;
        this.b = b;
    }

    public double ordinate(double x) {
        return k * x + b;
    }

    public Point intersection(Line line) {

        //y = k1x + b1 (this)
        //y = k2x + b2 (line)

        //0 = (k1x - k2x) + (b1 - b2)
        //0 = x(k1 - k2) + (b1 - b2)
        //x(k1 - k2) = -(b1 - b2)
        //x(k1 - k2) = b2 - b1
        //x = (b2 - b1) / (k1 - k2)

        if(this.getK() - line.getK() == 0) {
            return null;
        }

        double interX = (line.getB() - this.getB()) / (this.getK() - line.getK());
        double interY = this.getK() * interX + this.getB();

        Point interPoint = new Point(interX, interY);
        if(interPoint.isBelonging(this) && interPoint.isBelonging(line)) {
            return interPoint;
        }

        return null;
    }

    public Point intersection(Ray ray) {
        if(this.getK() - ray.getLine().getK() == 0) {
            return null;
        }

        double interX = (ray.getLine().getB() - this.getB()) / (this.getK() - ray.getLine().getK());
        double interY = this.getK() * interX + this.getB();

        Point interPoint = new Point(interX, interY);

        if(interPoint.isBelonging(this) && interPoint.isBelonging(ray)) {
            return interPoint;
        }

        return null;
    }

    public double getK() {
        return k;
    }

    public double getB() {
        return b;
    }
}
