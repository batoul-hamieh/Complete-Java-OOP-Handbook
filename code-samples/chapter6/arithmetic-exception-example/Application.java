import java.util.Scanner;

public class Application {
    
    public static int quotient(int n1, int n2) {
        if (n2 == 0) {
            throw new ArithmeticException("Divisor cannot be zero.");
        }
        return n1 / n2;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1, number2, q;

        System.out.print("Enter two integers: ");
        number1 = input.nextInt();
        number2 = input.nextInt();

        try {
            q = quotient(number1, number2);
            System.out.println("The quotient is " + q);
        } catch (ArithmeticException e) {
            System.out.println("Exception: Cannot divide by zero.");
        }
    }
}
