import java.util.Scanner;
import java.util.Random;

public class Client {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many triangles do you want to generate? ");
        int N = input.nextInt();
        Triangle[] triangles = new Triangle[N];
        int k = 0;
        Random r = new Random();

        while (k < N) {
            int a = r.nextInt(10) + 1;
            int b = r.nextInt(10) + 1;
            int c = r.nextInt(10) + 1;
            if (Triangle.isValid(a, b, c)) {
                triangles[k] = new Triangle(a, b, c);
                k++;
            }
        }

        System.out.println("Sides\tPerimeter\tType");
        for (int i = 0; i < N; i++) {
            System.out.print(triangles[i].toString() + "\t" + triangles[i].getPerimeter() + "\t");
            
            if (triangles[i].isIsosceles()) {
                System.out.print("Isosceles");
            } else if (triangles[i].isEquilateral()) {
                System.out.print("Equilateral");
            } else {
                System.out.print("Scalene");
            }
            
            System.out.print("\t");
            
            if (triangles[i].isRight()) {
                System.out.print("Right");
            }
            
            System.out.print("\n");
        }
    }
}
