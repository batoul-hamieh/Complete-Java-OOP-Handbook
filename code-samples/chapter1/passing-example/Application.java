public class Application {

    public static void main(String[] args) {
        Circle c1 = new Circle(5);

        System.out.println("The radius is " + c1.getRadius());

        updateCircle(c1);

        System.out.println("The radius is now " + c1.getRadius());
    }

    public static void updateCircle(Circle c) {
        c.setRadius(c.getRadius() + 1);
    }
}
