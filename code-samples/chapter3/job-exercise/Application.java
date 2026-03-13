import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Job[] jobs = new Job[4];
        Person[] persons = new Person[4];

        for (int i = 0; i < persons.length; i++) {
            System.out.println("Enter person information: ");
            String n = input.nextLine();
            String c = input.next();
            double s = input.nextDouble();
            input.nextLine(); // consume leftover newline
            
            jobs[i] = new Job(c, s);
            persons[i] = new Person(n, jobs[i]);
        }

        persons[0].setJob(new Job("Eng.", 1500));
        persons[0].getJob().setCategory("Engineer");

        System.out.println("The actual salary of every person: ");
        for (int i = 0; i < persons.length; i++) {
            System.out.print(persons[i].getJob().getSalary() + "\t");
        }

        System.out.println("\nThe average of all salaries of all persons: " +
            Person.getTotalSalary() / Person.getEmployeesCount());

        double max = 0;
        for (int i = 0; i < persons.length; i++) {
            if (persons[i].getJob().getSalary() > max) {
                max = persons[i].getJob().getSalary();
            }
        }

        for (int i = 0; i < persons.length; i++) {
            if (persons[i].getJob().getSalary() == max) {
                System.out.println("The person with the maximum actual salary is " + persons[i].getName());
            }
        }

        System.out.println("The description of all persons: ");
        for (int i = 0; i < persons.length; i++) {
            if (persons[i].getJob().getCategory().equals("Engineer")) {
                persons[i].bonus(100);
            }
            System.out.println(persons[i].toString());
        }
    }
}
