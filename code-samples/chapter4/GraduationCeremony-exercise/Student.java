public class Student extends Person {
    private int id;
    private double gpa;

    public Student(String n, String e, int id, double gpa) {
        super(n, e);
        this.id = id;
        this.gpa = gpa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        String status = (gpa < 2) ? "Under Probation" : "Good Standing";
        return super.toString() + ", " + id + ", " + status;
    }
}
