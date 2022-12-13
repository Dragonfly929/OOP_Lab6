package controller;

import model.IShape3D;
import java.util.ArrayList;

public class geometricObject3DController {

    static public IShape3D getBiggestSurfaceBody(ArrayList<IShape3D> bodies)  {
        double max = 0;
        IShape3D maxBody = null;

        for (IShape3D i : bodies) {
            double surf = i.getSurfaceArea();
            if (surf > max) {
                max = surf;
                maxBody = i;
            }
        }

        return maxBody;
    }

    static public IShape3D getBiggestVolumeBody(ArrayList<IShape3D> bodies) {
        double max = 0;
        IShape3D maxBody = null;

        for (IShape3D i : bodies) {
            double surf = i.getVolume();
            if (surf > max) {
                max = surf;
                maxBody = i;
            }
        }
        return maxBody;
    }
}
