package Exercise2;

class Line {
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

        if((this.b > line.b || this.b < line.b) && this.k == line.k) {
            return null;
        }

        double interX = (line.b - this.b) / (this.k - line.k);
        double interY = this.k * interX + this.b;

        Point interPoint = new Point(interX, interY);
        if(interPoint.isBelonging(this) && interPoint.isBelonging(line)) {
            return interPoint;
        }

        return null;
    }

    public Point intersection(Ray ray) {

        //Если прямые параллельны, то пересечения нету

        if((this.b > ray.getLine().b || this.b < ray.getLine().b) && this.k == ray.getLine().k) {
            return null;
        }

        //Если interX в другую сторону от направления луча, то пересечения нету

        double interX = (ray.getLine().b - this.b / (this.k - ray.getLine().k));
        double interY = this.k * interX + this.b;
        Point interPoint = new Point(interX, interY);

        if(interX > ray.getX0() && ray.isToRight()) {
            return interPoint;
        } else if(interX < ray.getX0() && !ray.isToRight()) {
            return interPoint;
        }

        return null;
    }
}
