public class Rectangle extends GeometricObject {
    private double width;
    private double height;

    public Rectangle(String c, boolean f, double width, double height) {
        setColor(c);
        setFilled(f);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double area() {
        return width * height;
    }

    public double perimeter() {
        return 2 * (width + height);
    }

    @Override
    public String toString() {
        String s = "The color is " + getColor();
        if (isFilled()) {
            s += "\nThe rectangle is filled";
        } else {
            s += "\nThe rectangle is not filled";
        }
        s += "\nThe height is " + height;
        s += "\nThe width is " + width;
        return s;
    }
}
