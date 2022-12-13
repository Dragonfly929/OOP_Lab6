package model;

public class TriangleSides extends Point implements IShape {
    private int a;
    private int b;
    private int c;

    public TriangleSides(int a, int b, int c) {
        super();
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public TriangleSides(int x, int y, int a, int b, int c) {
        this.x = x;
        this.y = y;
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() { return a; }
    public void setA(int a) { this.a = a; }

    public int getB() { return b; }
    public void setB(int b) { this.b = b; }

    public int getC() { return c; }
    public void setC(int c) { this.c = c; }

    public boolean checkTriangle() {
        return ((a+b) > c && (a+c) > b && (b+c) > a);
    }

    @Override
    public double getArea() {
        double p = getPerimeter() / 2;
        return Math.sqrt(p * ((p - a) * (p - b) * (p - c)));
    }

    @Override
    public double getPerimeter() {
        return (a + b + c);
    }

    public String typeTriangle() {
        if (a == b && b == c)
            return "Equilateral";
        else if (a == b || b == c || a == c)
            return "Isosceles";
        else
            return "Scalene";
    }

    public String triangleAngle() {
        double x = a * a;
        double y = b * b;
        double z = c * c;
        if(a>b && a>c) // largest side is 'a'
        {
            if(x == y + z)
                return "Right-angled";
            else if(x < y + z)
                return "Acute-angled";
            else
                return "Obtuse-angled";

        }
        else if(b>a && b>c) // largest side is 'b'
        {
            if(y == x + z)
                return "Right-angled";
            else if(y < x + z)
                return "Acute-angled";
            else
                return "Obtuse-angled";
        }
        else // largest side is 'c'
        {
            if(z == x + y)
                return "Right-angled";
            else if(z < x + y)
                return "Acute-angled";
            else
                return "Obtuse-angled";
        }
    }
}
