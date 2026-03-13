import java.util.Date;
import java.util.Random;
import java.util.Scanner; // for user input

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // creating an object of class Scanner to allow user input
        Random r = new Random();
        
        String employeeName; // entered by the user
        int employeeId; // generated randomly
        Employee e1;
        
        System.out.println("Enter the name of the employee: ");
        employeeName = input.nextLine();
        // nextLine() is used for String inputs
        
        employeeId = r.nextInt(10) + 1;
        // r.nextInt(10) generates random number btw 0-9, +1 shifts the range to 1-10
        
        e1 = new Employee(employeeId, employeeName);
        
        System.out.println("ID: " + e1.id + ", name: " + e1.name + ", hiring date: " + e1.hiringDate.toString());
    }
}
