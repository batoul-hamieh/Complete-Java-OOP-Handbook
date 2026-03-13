import java.util.ArrayList;

public class Mall {
    private String name;
    private ArrayList<Shop> shops;

    public Mall(String name) {
        this.name = name;
        this.shops = new ArrayList<Shop>();
    }

    public void addShop(Shop s) {
        shops.add(s);
    }

    public CoffeeShop searchForCoffeeShop() {
        for (int i = 0; i < shops.size(); i++) {
            Shop s = shops.get(i);
            if (s instanceof CoffeeShop) {
                CoffeeShop cs = (CoffeeShop) s;
                if (cs.hasOutdoorPatio()) {
                    return cs;
                }
            }
        }
        return null;
    }

    @Override
    public String toString() {
        String s = "Mall: " + name;
        for (int i = 0; i < shops.size(); i++) {
            s += "\n" + shops.get(i).toString();
        }
        return s;
    }
}
