package model;

public class Cuboid extends Rectangle implements IShape3D {
    private int z;
    private int height;

    public Cuboid(int length, int width, int height){
        super(length, width);
        this.setLength(length);
        this.setWidth(width);
        this.height = height;

    }

    public int getZ() {  return z; }
    public void setZ(int z) { this.z = z; }

    public int getHeight() { return height; }
    public void setHeight(int height) { this.height = height; }

    @Override
    public double getSurfaceArea() {
        return 2 * (getLength()*getWidth() + getLength()*height + getWidth()*height);
    }

    @Override
    public double getVolume() {
        return getLength() * getWidth() * height;
    }

}
