package model;

public class Rectangle implements IShape, ShapeInterface{
    private Point a;
    private Point b;
    private int length;
    private int width;

    public Rectangle(Point a, Point b) {
        super();
        this.a = a;
        this.b = b;
    }
    public Rectangle(int length, int width) {
        super();
        this.length = length;
        this.width = width;
    }

    public byte[][] draw(byte[][] output) {
        for (int row = a.getY(); row <= b.getY(); row++) {
            for (int col = a.getX(); col <= b.getX(); col++) {
                if ((row == a.getY() || row == b.getY()) || (col == a.getX() || col == b.getX())) {
                    output[row][col] = 'x';
                }
            }
        }
        return output;
    }

    public int getLength() { return length; }
    public void setLength(int length) { this.length = length; }

    public int getWidth() { return width; }
    public void setWidth(int width) { this.width = width; }

    @Override
    public double getArea() {
        return this.length * this.width;
    }

    @Override
    public double getPerimeter() {
        return 2 * (length + width);
    }

    public String isSquare() {
        if (length == width) {
            return "Square";
        } else {
            return "Rectangle";
        }
    }
}
