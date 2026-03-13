public class GraduationCeremony {
    private int year;
    private String campus;
    private Person[] persons;
    private int numStudents;
    private int numInstructors;

    public GraduationCeremony(int year, String campus) {
        this.year = year;
        this.campus = campus;
        this.persons = new Person[100];
        this.numStudents = 0;
        this.numInstructors = 0;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getCampus() {
        return campus;
    }

    public void setCampus(String campus) {
        this.campus = campus;
    }

    public int getNumInstructors() {
        return numInstructors;
    }

    public int getNumStudents() {
        return numStudents;
    }

    public Person[] getPersons() {
        return persons;
    }

    public void add(Person p) {
        int index = numStudents + numInstructors;
        if (index >= persons.length) {
            System.out.println("Cannot add more persons: array is full.");
            return;
        }
        persons[index] = p;
        if (p instanceof Student) {
            numStudents++;
        } else if (p instanceof Instructor) {
            numInstructors++;
        }
    }

    public Student callToPlatform() {
        double max = 0;
        int maxIndex = -1; // since array indexing starts at 0
        for (int i = 0; i < persons.length; i++) {
            if (persons[i] instanceof Student) {
                if (((Student) persons[i]).getGpa() > max) {
                    max = ((Student) persons[i]).getGpa();
                    maxIndex = i;
                }
            }
        }
        if (maxIndex != -1) {
            Student s = (Student) persons[maxIndex];
            persons[maxIndex] = null;
            numStudents--;
            return s;
        } else {
            return null;
        }
    }

    @Override
    public String toString() {
        String s = "Graduation Ceremony of " + year;
        s += "\nTotal number of invited students is: " + numStudents;
        s += "\ntotal number of invited instructors is: " + numInstructors;
        
        for (int i = 0; i < persons.length; i++) {
            if (persons[i] instanceof Student) {
                s += "\n" + ((Student) persons[i]).toString();
            }
        }
        for (int i = 0; i < persons.length; i++) {
            if (persons[i] instanceof Instructor) {
                s += "\n" + ((Instructor) persons[i]).toString();
            }
        }
        return s;
    }
}
