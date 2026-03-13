import java.util.*;

public class Main {
    public static void main(String[] args) {
        int n, m, sum;
        Scanner scan = new Scanner(System.in);
        boolean repeat = true;

        System.out.print("Enter two integers: ");
        
        do {
            try {
                n = scan.nextInt();
                m = scan.nextInt();
                sum = n + m;
                System.out.println("sum is: " + sum);
                repeat = false; // Input successful, break the loop
            } 
            catch (InputMismatchException ime) {
                scan.nextLine(); // To skip the invalid input and clear the buffer
                System.out.print("Invalid input. Please enter two integers: ");
            }
        } while (repeat);

        System.out.println("The end.");
        scan.close();
    }
}
