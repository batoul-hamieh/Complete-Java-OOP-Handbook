public class Person {
    private String name;
    private Job job;
    private static int employeesCount = 0;
    private static double totalSalary = 0;

    public Person(String name, Job job) {
        this.name = name;
        this.job = job;
        employeesCount++;
        totalSalary += job.getSalary();
    }

    public String getName() {
        return name;
    }

    public static int getEmployeesCount() {
        return employeesCount;
    }

    public static double getTotalSalary() {
        return totalSalary;
    }

    public void setJob(Job job) {
        totalSalary -= this.job.getSalary();
        this.job = job;
        totalSalary += job.getSalary();
    }

    public Job getJob() {
        return job;
    }

    public void bonus(double value) {
        job.setSalary(job.getSalary() + value);
        totalSalary += value;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", category: " + job.getCategory() +
               ", actual salary: " + job.getSalary() + ", total salaries: " +
               totalSalary;
    }
}
