public abstract class Medicine {
    protected String name;
    protected double price;

    public Medicine(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Medicine information:\nname: " + name + "\nprice: " + price;
    }
}
