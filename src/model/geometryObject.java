package model;

public enum geometryObject {
    POINT("Location in the coordinate space"),
    LINE("First point location"),
    POLYGON("Center Inscribed in Circle"),
    TRIANGLE("A corner"),
    RECTANGLE("Right upper corner"),
    ELLIPSE("Ellipse's center"),
    ELLIPSOID("Center of the ellipsoid 3D coordinate system"),
    CUBOID("Base's center 3D coordinate system"),
    PRISM("Base's center 3D coordinate system");

    private final String pointPosition;

    geometryObject(String pointPosition) {
        this.pointPosition = pointPosition;
    }

    public String getPointPosition() {
        return pointPosition;
    }
}
