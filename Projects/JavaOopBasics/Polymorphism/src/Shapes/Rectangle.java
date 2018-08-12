package Shapes;

public class Rectangle extends Shape {
    private double sideA;
    private double sideB;

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double getPerimeter() {
        return super.perimeter;
    }

    @Override
    public void calculatePerimeter() {
        super.setPerimeter(this.sideA * 2 + this.sideB * 2);
    }

    @Override
    public void calculateArea() {
        super.setArea(this.sideA * this.sideB);
    }
}
