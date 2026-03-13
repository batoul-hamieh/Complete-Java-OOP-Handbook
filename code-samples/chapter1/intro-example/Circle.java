### Circle.java

public class Circle {
    double radius;
    static int nbOfObjects = 0;

    public Circle(double r) {
        radius = r;
        nbOfObjects++;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public static int getNbOfObjects() {
        return nbOfObjects;
    }
}
