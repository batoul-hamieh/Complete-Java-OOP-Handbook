public class Test {
    public static void main(String[] args) {
        Course course1 = new Course("Object-Oriented Programming", 5);
        
        Student s1 = new Student(1, "A");
        Student s2 = new Student(2, "B");
        Student s3 = new Student(3, "C");
        Student s4 = new Student(4, "D");
        
        course1.addStudent(s1);
        course1.addStudent(s2);
        course1.addStudent(s3);
        course1.addStudent(s4);
        
        Student s5 = new Student(5, "E");
        Student s6 = new Student(6, "F");
        
        course1.addStudent(s5);
        course1.addStudent(s6); /* this student will not be added since the array is full (specified size is 5) */
        
        course1.print();
    }
}
