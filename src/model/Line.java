package model;

public class Line extends Point {
    private Point a;
    private Point b;
    protected double x1;
    protected double y1;
    private String color;

    public Line() {
        super();
        this.x1 = x1;
        this.y1 = y1;
    }

    public Line(Point a, Point b){
        this.a = a;
        this.b = b;
    }

    public Line(int x, int y, int x1, int y1) {
        super();
        this.x = x;
        this.y = y;
        this.x1 = x1;
        this.y1 = y1;
    }

    public double getX1() { return x1; }
    public void setX1(double x1) { this.x1 = x1; }

    public double getY1() { return y1; }
    public void setY1(double y1) { this.y1 = y1; }

    public Point getA() {
        return a;
    }
    public void setA(Point a) {
        this.a = a;
    }

    public Point getB() {
        return b;
    }
    public void setB(Point b) {
        this.b = b;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public String lineLength() {
        double length = Math.sqrt(Math.pow(x1 - x, 2) +
                                  Math.pow(y1 - y, 2));
        return "Line's length is " + length;
    }

    public String printAngle() {
        double angleInDegrees = Math.atan2 (y1-y, x1-x) * 180.0 / Math.PI;
        return "Angle is " + angleInDegrees + " degrees";
    }

    public String lineType() {
        if (x == x1 && y != y1) {
            return "The Line is Vertical";
        } else if (x != x1 && y == y1) {
            return "The Line is Horizontal";
        } else if (x != x1 || y != y1) {
            return "The Line is Oblique";
        } else {
            return "The Points coincide or not straight line";
        }
    }

}
