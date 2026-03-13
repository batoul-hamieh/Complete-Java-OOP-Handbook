public abstract class Shop {
    protected String name;
    protected int floor;
    protected double size;

    public Shop(String name, int floor, double size) {
        if (floor < 0 || floor > 3) {
            throw new IllegalArgumentException("Floor must be between 0 and 3.");
        }
        this.name = name;
        this.floor = floor;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public abstract double computeRent();

    @Override
    public String toString() {
        return "Name: " + name + ", Floor: " + floor + ", Size: " + size;
    }
}
