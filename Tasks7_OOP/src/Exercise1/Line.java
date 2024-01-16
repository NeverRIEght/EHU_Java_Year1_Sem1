package Exercise1;

public class Line {
    //y = k * x + b
    private double k;
    private double b;

    public Line() {

    }

    public Line(double k, double b) {
        this.k = k;
        this.b = b;
    }

    public boolean isParallel(Line line) {
        return (this.getB() > line.getB() || this.getB() < line.getB()) && this.getK() == line.getK();
    }

    public boolean isPerpendicular(Line line) {
        return this.getK() * line.getK() == -1;
    }

    public boolean isOver(Line line) {
        return (this.getB() > line.getB() && this.getK() == line.getK());
    }

    public double angleOfSlope() {
        return Math.atan(this.getK());
    }

    public double abscissa0() {
        return -this.getB() / this.getK();
    }

    public double getK() {
        return k;
    }

    public void setK(double k) {
        this.k = k;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }
}
