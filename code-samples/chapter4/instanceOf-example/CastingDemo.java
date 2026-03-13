public class CastingDemo {
    public static void main(String[] args) {
        GeometricObject g1, g2;
        g1 = new Circle("Red", true, 1);
        g2 = new Rectangle("Red", true, 5, 6);
        displayObject(g1);
        displayObject(g2);
    }

    public static void displayObject(GeometricObject g) {
        if (g instanceof Circle) {
            System.out.println("Circle area is " + ((Circle) g).area());
        } else if (g instanceof Rectangle) {
            System.out.println("Rectangle perimeter is " + ((Rectangle) g).perimeter());
        }
    }
}
