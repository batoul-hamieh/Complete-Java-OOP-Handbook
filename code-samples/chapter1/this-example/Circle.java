public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {
        this(1.0); // used to call the previous constructor
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }
}
