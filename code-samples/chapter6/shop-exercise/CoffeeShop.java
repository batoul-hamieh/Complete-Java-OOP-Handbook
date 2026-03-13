public class CoffeeShop extends Shop {
    private boolean hasOutdoorPatio;

    public CoffeeShop(String name, int floor, double size, boolean hasOutdoorPatio) {
        super(name, floor, size);
        this.hasOutdoorPatio = hasOutdoorPatio;
    }

    public boolean hasOutdoorPatio() {
        return hasOutdoorPatio;
    }

    @Override
    public double computeRent() {
        double rent = size * 20;
        if (hasOutdoorPatio) {
            rent += 100;
        }
        return rent;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof CoffeeShop) {
            CoffeeShop other = (CoffeeShop) o;
            return this.computeRent() == other.computeRent();
        }
        return false;
    }

    @Override
    public String toString() {
        return hasOutdoorPatio + " " + super.toString();
    }
}
