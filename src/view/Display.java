package view;

import controller.geometricObject2DController;
import controller.geometricObject3DController;
import model.*;
import model.Polygon;
import model.Rectangle;

import java.util.ArrayList;

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

    static public void displayCuboid() {
        Cuboid cuboid = new Cuboid(10,4,3);
        if (cuboid.getLength() == cuboid.getWidth() && cuboid.getWidth() == cuboid.getHeight()){
            System.out.println("Cube with side equal to " + cuboid.getWidth());
        } else {
            System.out.println("Cuboid's dimensions - length: " + cuboid.getLength() + " width: " + cuboid.getWidth() + " height: " + cuboid.getHeight());
        }
        System.out.println("Surface Area: " + cuboid.getSurfaceArea());
        System.out.println("Volume: " + cuboid.getVolume());
    }

    static public void displayPrism() {
        Prism prism = new Prism(5,4,4);
        System.out.println("Prism with base shape of " + prism.getPolygonType());
        System.out.println("Surface Area: " + prism.getSurfaceArea());
        System.out.println("Volume: " + prism.getVolume());
    }

    static public void displayBigestDim3D(){
        ArrayList<IShape3D> objects = new ArrayList<IShape3D>();

        IShape3D cuboid = new Cuboid(4,5,4);
        IShape3D ellipsoid = new Ellipsoid(4,5,4);
        IShape3D prism = new Prism(4,5,4);
        objects.add(cuboid);
        objects.add(ellipsoid);
        objects.add(prism);

        System.out.println("Biggest Surface Area " + geometricObject3DController.getBiggestSurfaceArea(objects).getSurfaceArea());
        System.out.println("Biggest Volume " + geometricObject3DController.getBiggestVolume(objects).getVolume());
    }

    static public void displayBiggetsDim2D() {
        ArrayList<IShape> objects = new ArrayList<IShape>();

        IShape trianglesides = new TriangleSides(3,4,5);
        IShape trianglecoord = new TriangleCoordinates(0,0,3,0,0,4);
        IShape rectangle = new Rectangle(4,5);
        IShape polygon = new Polygon(4,5);
        IShape ellipse = new Ellipse(4,5);
        objects.add(trianglesides);
        objects.add(trianglecoord);
        objects.add(rectangle);
        objects.add(polygon);
        objects.add(ellipse);

        System.out.println("Biggest Perimeter: " + geometricObject2DController.getBiggestPerimeterShape(objects).getPerimeter());
        System.out.println("Biggest Area: " + geometricObject2DController.getBiggestAreaShape(objects).getArea());
    }
}
