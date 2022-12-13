package model;

import java.util.Random;

public class Polygon implements IShape{
    private int side;
    private int nrOfSides;
    private final int[] nrSides = {3, 4, 6, 7, 8, 9, 10};
    private final String[] type = {"Triangle", "Quadrilateral", "Pentagon", "Hexagon", "Heptagon", "Nonagon", "Decagon"};

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
        Random random = new Random();
        int randomInd = random.nextInt(type.length);
        return "Polygon has " + nrSides[randomInd] + " sides: " + type[randomInd];
    }

    public String getInteriorAngle() {
        double sum;
        Random random = new Random();
        int randomIndex = random.nextInt(nrSides.length);
        System.out.println("Regular Polygon");
        return type[randomIndex] + "'s Interior angle sum: " + 180*(nrSides[randomIndex]-2) + "degrees" +
                "\nInterior angle: " + (180*(nrSides[randomIndex]-2))/nrSides[randomIndex];
    }
}
