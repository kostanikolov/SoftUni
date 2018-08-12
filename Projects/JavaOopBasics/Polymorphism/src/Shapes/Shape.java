package Shapes;

public abstract class Shape {
    protected double perimeter;
    protected double area;

    protected void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    protected void setArea(double area) {
        this.area = area;
    }

    public abstract double getPerimeter();

    public double getArea() {
        return this.area;
    }

    public abstract void calculatePerimeter();
    public abstract void calculateArea();
}
