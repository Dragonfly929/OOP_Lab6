package model;

public class TriangleCoordinates extends Line implements IShape {
    private int x2;
    private int y2;

    public TriangleCoordinates() {
        super();
        this.x = x;
        this.y = y;
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public TriangleCoordinates(int x, int y, int x1, int y1, int x2, int y2) {
        super();
        this.x = x;
        this.y = y;
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public int getX2() {
        return x2;
    }
    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getY2() {
        return y2;
    }
    public void setY2(int y2) {
        this.y2 = y2;
    }

    public double getSideAB() {
        return Math.sqrt(Math.pow(((x1)-(x)),2) + Math.pow(((y1)-(y)),2));
    }

    public double getSideBC() {
        return Math.sqrt(Math.pow(((x2)-(x1)),2) + Math.pow(((y2)-(y1)),2));
    }

    public double getSideAC() { return Math.sqrt(Math.pow(((x)-(x2)),2) + Math.pow(((y)-(y2)),2)); }

    public boolean checkTriangle() {
        double a = x * (y1 - y2) +
                   x1 * (y2 - y) +
                   x2 * (y - y1);
        return a != 0;
    }

    @Override
    public double getArea() {
        double perimeter = getSideAB() + getSideBC() + getSideAC();
        double s = (perimeter * 0.5);
        double a = getSideAB(), b = getSideBC(), c = getSideAC();
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    public double getPerimeter() {
        double a= getSideAB(), b = getSideBC(), c = getSideAC();
        return (a + b + c);
    }
}
