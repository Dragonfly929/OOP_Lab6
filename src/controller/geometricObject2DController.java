package controller;

import model.IShape;
import model.IShape3D;

import java.util.ArrayList;

public class geometricObject2DController {
    static public IShape getBiggestPerimeterShape(ArrayList<IShape> bodies)  {
        double max = 0;
        IShape maxShape = null;

        for (IShape i : bodies) {
            double surf = i.getPerimeter();
            if (surf > max) {
                max = surf;
                maxShape = i;
            }
        }

        return maxShape;
    }

    static public IShape getBiggestAreaShape(ArrayList<IShape> bodies) {
        double max = 0;
        IShape maxShape = null;

        for (IShape i : bodies) {
            double surf = i.getArea();
            if (surf > max) {
                max = surf;
                maxShape = i;
            }
        }
        return maxShape;
    }
}
