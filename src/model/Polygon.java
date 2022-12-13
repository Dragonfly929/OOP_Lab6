package model;

import java.util.Random;

public class Polygon implements IShape{
    private int side;
    private int nrOfSides;
    private String type;

    int getSide() { return side; }
    private void setSide(int side) { this.side = side; }

    int getNrOfSides() { return nrOfSides; }
    private void setNrOfSides(int nrOfSides) { this.nrOfSides = nrOfSides; }

    public Polygon(int side, int nr) {
        this.side = side;
        this.nrOfSides = nr;
    }
    @Override
    public double getArea() {
        double p = nrOfSides * side;
        double a = side/(2 * Math.tan(Math.toRadians(180 / (double) nrOfSides)));
        return p*a/2;
    }

    @Override
    public double getPerimeter() {
        return nrOfSides * side;
    }

    public String getPolygonType() {
        switch (nrOfSides){
            case 3 -> {
                type = "Triangle";
                System.out.println(type);
            }
            case 4 -> {
                type = "Quadrilateral";
                System.out.println(type);
            }
            case 5 -> {
                type = "Pentagon";
                System.out.println(type);
            }
            case 6 -> {
                type = "Hexagon";
                System.out.println(type);
            }
            case 7 -> {
                type = "Heptagon";
                System.out.println(type);
            }
            case 8 -> {
                type = "Octagon";
                System.out.println(type);
            }
            case 9 -> {
                type = "Nonagon";
                System.out.println(type);
            }
            case 10 -> {
                type = "Decagon";
                System.out.println(type);
            }

        }
        return type;
    }

    public String getInteriorAngle() {
        double sum;
        System.out.println("Regular Polygon");
        return type + "'s Interior angle sum: " + 180*(nrOfSides-2) + "degrees" +
                "\nInterior angle: " + (180*(nrOfSides-2))/nrOfSides;
    }
}
