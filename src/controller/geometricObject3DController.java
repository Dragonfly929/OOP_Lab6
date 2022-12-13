package controller;

import model.IShape3D;
import java.util.ArrayList;

public class geometricObject3DController {

    static public IShape3D getBiggestSurfaceArea(ArrayList<IShape3D> bodies)  {
        double max = 0;
        IShape3D maxObject = null;

        for (IShape3D i : bodies) {
            double surf = i.getSurfaceArea();
            if (surf > max) {
                max = surf;
                maxObject = i;
            }
        }

        return maxObject;
    }

    static public IShape3D getBiggestVolume(ArrayList<IShape3D> bodies) {
        double max = 0;
        IShape3D maxObject = null;

        for (IShape3D i : bodies) {
            double surf = i.getVolume();
            if (surf > max) {
                max = surf;
                maxObject = i;
            }
        }
        return maxObject;
    }
}
