package model;

public class Ellipse extends Point implements IShape {
    protected int a;
    protected int b;

    public Ellipse(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public Ellipse(int x, int y, int a, int b){
        super();
        this.a = a;
        this.b = b;
    }

    public int getA() { return a; }
    public void setA(int a) { this.a = a; }

    public int getB() { return b; }
    public void setB(int b) { this.b = b; }

    @Override
    public double getArea() {
            return Math.PI * a * b;
    }

    @Override
    public double getPerimeter() {
        if (a == b) {
            return 2 * Math.PI * a;
        } else {
//            System.out.println("Ellipse's Perimeter simple approximation: " + 2*Math.PI*Math.sqrt((a*a+b*b)/2));
//            System.out.print("Ellipse's Perimeter computed with Ramanujan approximation: ");
            double h = (Math.pow((a-b), 2)/Math.pow((a+b), 2));
            return Math.PI * (a+b) * (1 + ((3*h) / (10+Math.sqrt(4-3*h))));
        }
    }

    public void getDiameter() {
        if (a > b) {
            System.out.println("Major axis diameter: " + 2 * a +
                    "\nMinor axis diameter: " + 2 * b);
        } else if (a < b) {
            System.out.println("Major axis diameter: " + 2 * b +
                    "\nMinor axis diameter: " + 2 * a);
        } else {
            System.out.println("Circle with diameter:" + 2 * a);
        }
    }

    public String isCircle() {
        if (a == b) {
            return "Circle";
        } else if (a == 0 && b != 0 || a != 0 && b == 0){
            return "Line";
        } else if (a == 0) {
            return "Point";
        } else {
            return "Ellipse";
        }
    }

}
