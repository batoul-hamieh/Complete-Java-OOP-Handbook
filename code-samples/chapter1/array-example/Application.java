import java.util.Random;

public class Application {

    public static void main(String[] args) {

        Random r = new Random();
        Circle[] arrayCircle = new Circle[10];

        for (int i = 0; i < arrayCircle.length; i++) {
            arrayCircle[i] = new Circle(r.nextDouble() * 10);

            System.out.println("Circle " + i + " of radius = " + arrayCircle[i].getRadius());
            System.out.println("Its area is " + arrayCircle[i].getArea());
        }
    }
}
