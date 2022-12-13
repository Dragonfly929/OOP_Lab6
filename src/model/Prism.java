package model;

public class Prism extends Polygon implements IShape3D{
    private int height;

    public Prism(int side, int nr, int height) {
        super(side, nr);
        this.height = height;

    }

    @Override
    public double getSurfaceArea() {
        return 2 * getArea() + getNrOfSides() * getSide()*height;
    }

    @Override
    public double getVolume() {
        return getArea() * height;
    }

    public int getHeight() { return height; }
    public void setHeight(int height) { this.height = height; }
}
