public class Circle extends GeometricObject {
    private double radius;

    public Circle(String c, boolean f, double r) {
        setColor(c); /* Using setter methods in the constructor 
                        to initialize inherited properties */
        setFilled(f);
        radius = r;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double area() {
        return radius * radius * Math.PI;
    }

    @Override
    public String toString() {
        String s = "The color is " + getColor();
        if (isFilled()) {
            s += "\nThe circle is filled";
        } else {
            s += "\nThe circle is not filled";
        }
        s += "\nThe radius is " + radius;
        return s;
    }
}
