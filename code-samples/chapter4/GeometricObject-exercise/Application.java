import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter nb of edges: ");
        int nbOfEdges = input.nextInt();
        
        Shape shape = new Shape(nbOfEdges, "Blue", true);
        System.out.println(shape);
        
        System.out.println("The longest edge in the previous shape: " + getLongestEdge(shape));
        
        GeometricObject[] g = new GeometricObject[10];
        for (int i = 0; i < g.length; i += 2) {
            g[i] = new GeometricObject();
            g[i + 1] = new Shape(3 + i, "Red", false);
        }
        
        Shape[] s;
        s = getShape(g);
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
    }

    public static double getLongestEdge(Shape shape) {
        double max = 0;
        for (Edge e : shape.getEdges()) {
            max = Math.max(max, e.getLength());
        }
        return max;
    }

    public static Shape[] getShape(GeometricObject[] g) {
        int nbOfShapeObjects = 0;
        for (int i = 0; i < g.length; i++) {
            if (g[i] instanceof Shape) {
                nbOfShapeObjects++;
            }
        }
        
        Shape[] shapes = new Shape[nbOfShapeObjects];
        for (int i = 0, j = 0; i < g.length; i++) {
            if (g[i] instanceof Shape) {
                shapes[j] = (Shape) g[i];
                j++;
            }
        }
        return shapes;
    }
}
