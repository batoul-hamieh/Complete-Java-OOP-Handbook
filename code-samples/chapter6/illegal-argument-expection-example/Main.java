import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the name and the id: ");
        
        // Note: next() reads until a space, nextInt() reads the ID
        String name = scan.next();
        int id = scan.nextInt();

        try {
            Student s = new Student(id, name);
            s.print();
        } catch (IllegalArgumentException iae) {
            // This prints the specific message you wrote in the constructor
            System.out.println(iae.getMessage());
        }
        
        scan.close();
    }
}
