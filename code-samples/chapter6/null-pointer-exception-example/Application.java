public class Student {
    private int id;
    private String name;

    public Student(int i, String n) {
        id = i;
        name = n;
    }

    public void print() {
        System.out.println("The ID is " + id + " The name is " + name);
    }
}

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Student[] s = new Student[10];

        // Initializing only the first two slots
        s[0] = new Student(1, "A");
        s[1] = new Student(2, "B");

        int index;
        System.out.println("Enter an index: ");
        index = scan.nextInt();

        try {
            // This might throw ArrayIndexOutOfBoundsException or NullPointerException
            s[index].print();
        } 
        catch (ArrayIndexOutOfBoundsException e1) {
            System.out.println("Index Out of bounds");
        } 
        catch (NullPointerException e) {
            System.out.println("Attempting to access a null reference");
        }

        System.out.println("The end");
        scan.close();
    }
}
