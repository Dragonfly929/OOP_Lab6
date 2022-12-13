import model.*;

import java.util.ArrayList;

import static view.Display.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello");
        Cuboid c = new Cuboid(2,3,5);
        System.out.println(c.getSurfaceArea());
        System.out.println(c.getVolume());
        for (geometryObject object : geometryObject.values()) {
            System.out.print("\n=========================================");
            int i = 0;
            while (i < object.toString().length()) {
                System.out.print("=");
                i++;
            }
            System.out.println();
            System.out.println("Design and drafting software Simulation: " + object);
            System.out.print("=========================================");
            int j = 0;
            while (j < object.toString().length()) {
                System.out.print("=");
                j++;
            }
            System.out.println("\nPosition Point: " + object.getPointPosition());

            switch (object) {
                case LINE -> {
                    displayLine();
                }
                case POLYGON -> {
                    displayPolygon();
                }
                case TRIANGLE -> {
                    displayTriangle();
                }
                case RECTANGLE -> {
                    displayRectangle();
                }
                case ELLIPSE -> {
                    displayEllipse();
                }
                case ELLIPSOID -> {
                    displayEllipsoid();
                }
                case CUBOID -> {
                    displayCuboid();
                }
                case PRISM -> {
                    displayPrism();
                }
            }
        }

        System.out.println();

        displayBigestDim3D();
        displayBiggetsDim2D();
    }
}