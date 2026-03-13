class Circle {
    private double radius;

    public Circle(double r) throws InvalidRadiusException {
        if (r < 0) {
            throw new InvalidRadiusException("The radius cannot be negative");
        }
        radius = r;
    }

    public void print() {
        System.out.println("The radius is " + radius);
    }
}
