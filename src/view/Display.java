package view;

import model.*;
import model.Point;
import model.Polygon;
import model.Rectangle;

import java.awt.*;
import java.util.Objects;

public class Display {
    static public void displayLine() {
        Line l = new Line(0,0,10,10);
        System.out.println(l.lineType());
        System.out.println(l.lineLength());
        System.out.println(l.printAngle());
    }

    static public void displayPolygon () {
        Polygon polygon = new Polygon(4,4);
        System.out.println(polygon.getPolygonType());
        System.out.println(polygon.getInteriorAngle());
        System.out.println("Area: "+polygon.getArea());
        System.out.println("Perimeter: " + polygon.getPerimeter());
    }

    static public void displayTriangle() {
        TriangleSides t = new TriangleSides(9,9,9);
        System.out.println("The segments given form: " + t.checkTriangle());
        if (t.checkTriangle()) {
            System.out.println("Triangle's Position: (" + t.getX() + ", " + t.getY() + ")");
            System.out.println(t.getArea());
            System.out.println(t.getPerimeter());
            t.setColor("RED");
            System.out.println("Triangle's color is " + t.getColor());
            System.out.println("Triangle type by angle: " + t.triangleAngle());
            System.out.println("Triangle type by sides: " + t.typeTriangle());
        }

        TriangleCoordinates tc = new TriangleCoordinates(0,0,0,3,4,0);
        System.out.println("The coordinates given from a triangle? " + tc.checkTriangle());
        if (tc.checkTriangle()){
            System.out.println(tc.getPerimeter());
            System.out.println(tc.getArea());
        }
    }
//    POLYGON("Center Inscribed in Circle"),
//    TRIANGLE("A corner"),
//    RECTANGLE("Right upper corner"),
//    ELLIPSE("Ellipse's center"),
//    ELLIPSOID("Center of the ellipsoid 3D coordinate system"),
//    CUBOID("Base's center 3D coordinate system"),
//    PRISM("Base's center 3D coordinate system");


    static public void displayRectangle() {
        Rectangle rectangle = new Rectangle(8,4);
        System.out.println(rectangle.isSquare());
        if (rectangle.isSquare().equals("Square")) {
            System.out.println("Side equal to " + rectangle.getLength());
        } else {
            System.out.println("Length: " + rectangle.getLength());
            System.out.println("Width: " + rectangle.getWidth());
        }
        System.out.println("Area: " +  rectangle.getArea());
        System.out.println("Perimeter: " +  rectangle.getPerimeter());
    }

    static public void displayEllipse() {
        Ellipse ellipse = new Ellipse(3,6);
        System.out.println(ellipse.isCircle());
        if (ellipse.isCircle().equals("Circle") || ellipse.isCircle().equals("Ellipse")) {
            System.out.println("Perimeter: " + ellipse.getPerimeter());
            System.out.println("Area: " + ellipse.getArea());
            ellipse.getDiameter();
        }
    }

    static public void displayEllipsoid() {
        Ellipsoid ellipsoid = new Ellipsoid(6,6,6);
        if (ellipsoid.getA() == ellipsoid.getB() && ellipsoid.getA() == ellipsoid.getC()) {
            System.out.println("Sphere's Surface Area: " + ellipsoid.getSurfaceArea());
            System.out.println("Sphere's Volume: " + ellipsoid.getVolume());
        } else {
            System.out.println("Ellipsoid's Surface Area: " + ellipsoid.getSurfaceArea());
            System.out.println("Ellipsoid's Volume: " + ellipsoid.getVolume());
        }
    }
}
