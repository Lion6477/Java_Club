public class OverridesExample {
    static double GetArea(Figure f) {
        return f.area();
    }

    public static void main(String[] args) {

        Triangle triangle = new Triangle(8.3, 2.4);
        triangle.s = GetArea(triangle);
        System.out.println(triangle);

        Circle circle = new Circle(2.4);
        circle.s = GetArea(circle);
        System.out.println(circle);

        Square square = new Square(6.4);
        square.s = GetArea(square);
        System.out.println(square);

        Rectangle rectangle = new Rectangle(5.4, 1.2);
        rectangle.s = GetArea(rectangle);
        System.out.println(rectangle);

    }
}

abstract class Figure {
    abstract double area();
}

class Triangle extends Figure {
    protected double s, b, h;

    public Triangle(double b, double h) {
        this.h = h;
        this.b = b;
    }

    @Override
    public String toString() {
        return "Triangle parameters: b= " + b + ", h= " + h + ", Area= " + this.s + ".";
    }

    @Override
    protected double area() {
        return s = b * h / 2;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }
}

class Circle extends Figure {
    protected double s, r;
    double two = 2.0;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public String toString() {
        return "Circle parameters: r= " + r + ", Area= " + this.s + ".";
    }

    protected double area() {
        return s = Math.PI * Math.pow(r, two);
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
}

class Square extends Figure {
    protected double s, a;
    double two = 2.0;

    public Square(double a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return "Square parameters: a= " + a + ", Area= " + this.s + ".";
    }

    protected double area() {
        return s = Math.pow(a, two);
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }
}

class Rectangle extends Figure {
    protected double s, h, w;
    double two = 2.0;

    public Rectangle(double h, double w) {
        this.w = w;
        this.h = h;
    }

    @Override
    public String toString() {
        return "Rectangle parameters: h= " + h + ", w= " + w + ", Area= " + this.s + ".";
    }

    protected double area() {
        return s = w * h;
    }

    public double getW() {
        return w;
    }

    public void setW(double w) {
        this.w = w;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }
}

