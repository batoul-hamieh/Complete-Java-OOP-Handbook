public class Course {
    private String name;
    private Student[] students; // this statement creates the composition relationship
    private int nbOfStudents;

    public Course(String name, int size) {
        this.name = name;
        nbOfStudents = 0;
        students = new Student[size];
    }

    public void addStudent(Student student) {
        if (nbOfStudents == students.length) {
            System.out.println("Cannot add more students, this section is full");
        } else {
            students[nbOfStudents] = student;
            nbOfStudents++;
        }
    }

    public Student[] getStudents() {
        return students;
    }

    public int getNbOfStudents() {
        return nbOfStudents;
    }

    public String getName() {
        return name;
    }

    public void print() {
        System.out.println("The course name is " + name);
        System.out.println("The number of students is " + nbOfStudents);
        System.out.println("The students registered in this course are: ");
        for (int i = 0; i < nbOfStudents; i++) {
            students[i].print(); // calling print() of Student class
        }
    }
}
