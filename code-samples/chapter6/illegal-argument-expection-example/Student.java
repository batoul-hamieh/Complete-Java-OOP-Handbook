public class Student {
    private int id;
    private String name;

    public Student(int i, String n) throws IllegalArgumentException {
        if (i < 0) {
            throw new IllegalArgumentException("ID cannot be negative.");
        }
        if (n.length() < 2) {
            throw new IllegalArgumentException("Name should have at least 2 letters.");
        }
        id = i;
        name = n;
    }

    public void print() {
        System.out.println("ID: " + id + " Name: " + name);
    }
}
