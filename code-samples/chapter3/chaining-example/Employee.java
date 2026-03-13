class Employee extends Person {
    public Employee() {
        this("Invoke Employee's overloaded constructor");
        System.out.println("Employee's no-arg constructor is invoked");
    }

    public Employee(String s) {
        System.out.println(s);
    }
}
