public class OverCounter extends Medicine implements Taxable {
    private boolean isSupplement;

    public OverCounter(String name, double price, boolean isSupplement) {
        super(name, price);
        this.isSupplement = isSupplement;
    }

    @Override
    public double findPriceAfterTax() {
        double p = this.price * 1.1;
        return p;
    }

    @Override
    public String toString() {
        String s = super.toString();
        if (isSupplement) {
            s += "\nIt is supplement";
        } else {
            s += "\nIt is not supplement";
        }
        return s;
    }
}
