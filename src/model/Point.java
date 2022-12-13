package model;

public abstract class Point {
    protected int x;
    protected int y;

    private String color;
    public Point() {
        this.x = x;
        this.y = y;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() { return x; }
    public void setX(int x) { this.x = x; }

    public int getY() { return y; }
    public void setY(int y) { this.y = y; }

    public String getColor() {return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
