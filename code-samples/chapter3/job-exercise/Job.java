public class Job {
    private String category;
    private double salary;

    public Job(String c, double s) {
        category = c;
        salary = s;
    }

    public String getCategory() {
        return category;
    }

    public double getSalary() {
        return salary;
    }

    public void setCategory(String c) {
        category = c;
    }

    public void setSalary(double s) {
        if (s >= 0) {
            salary = s;
        } else {
            System.out.println("Salary must be non-negative.");
        }
    }

    @Override
    public String toString() {
        return "The job category is " + category + "\nThe job salary is " + salary;
    }
}
