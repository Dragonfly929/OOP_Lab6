package model;

public class Ellipsoid extends Ellipse implements IShape3D {
    private int z;
    private int c;

    public Ellipsoid(int a, int b, int c) {
        super(a, b);
        this.c = c;
    }

    @Override
    public double getSurfaceArea() {
        return 4 * Math.PI * Math.pow((Math.pow(a * b, 1.6) +
                Math.pow(a * c, 1.6) + Math.pow(b * c, 1.6)) /
                3, 1 / 1.6);
    }

    @Override
    public double getVolume() {
        return 4 * Math.PI * a * b * c;
    }

    public int getZ() { return z; }
    public void setZ(int z) { this.z = z; }

    public int getC() { return c; }
    public void setC(int c) { this.c = c; }

}
