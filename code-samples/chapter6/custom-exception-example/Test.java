import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double r;
        
        System.out.println("Enter a radius: ");
        r = scan.nextDouble();

        try {
            Circle c1 = new Circle(r);
            c1.print();
        } catch (InvalidRadiusException ex) {
            // This will print the exception type and the custom message
            System.out.println(ex);
        }
        
        scan.close();
    }
}
