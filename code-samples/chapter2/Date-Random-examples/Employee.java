import java.util.Date;

public class Employee {
    int id;
    String name;
    Date hiringDate;

    public Employee(int i, String n) {
        id = i;
        name = n;
        hiringDate = new Date();
    }
}
