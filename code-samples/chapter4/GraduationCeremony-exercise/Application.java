import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.util.in);
        System.out.print("Enter the campus: ");
        String campus = input.nextLine();
        
        GraduationCeremony gc = new GraduationCeremony(2018, campus);
        char c;
        
        do {
            System.out.print("Add a person (s for student, i for instructor, n to stop): ");
            c = input.nextLine().charAt(0);
            
            if (c == 's') {
                System.out.print("Enter student name: ");
                String name = input.nextLine();
                System.out.print("Enter student email: ");
                String email = input.nextLine();
                System.out.print("Enter ID: ");
                int id = input.nextInt();
                System.out.print("Enter GPA: ");
                double gpa = input.nextDouble();
                input.nextLine(); /* Consume the leftover newline character 
                                     after nextDouble() to avoid input issues */
                gc.add(new Student(name, email, id, gpa));
            } else if (c == 'i') {
                System.out.print("Enter instructor name: ");
                String name = input.nextLine();
                System.out.print("Enter email: ");
                String email = input.nextLine();
                System.out.print("Enter department: ");
                String department = input.nextLine();
                gc.add(new Instructor(name, email, department));
            }
        } while (c != 'n');

        System.out.print(gc);

        int count = 0;
        for (int i = 0; i < gc.getPersons().length; i++) {
            if (gc.getPersons()[i] != null && gc.getPersons()[i] instanceof Student) {
                if (((Student) gc.getPersons()[i]).getGpa() > 3.5) {
                    count++;
                }
            }
        }
        
        System.out.println("nb of students with GPA > 3.5: " + count);
        System.out.println("Instructors: ");
        
        for (int i = 0; i < gc.getPersons().length; i++) {
            if (gc.getPersons()[i] instanceof Instructor) {
                Instructor inst = (Instructor) gc.getPersons()[i];
                System.out.println(inst.getName() + ", " + inst.getDepartment());
            }
        }

        System.out.println("Calling students to platform: ");
        Student student;
        while ((student = gc.callToPlatform()) != null) {
            System.out.println(student.getName() + " called to the platform");
        }
    }
}
