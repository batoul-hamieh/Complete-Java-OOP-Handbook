public class Test {
    public static void main(String[] args) {
        try {
            Mall mall = new Mall("Lebanon Mall");

            // Adding a CoffeeShop
            CoffeeShop coffeeShop = new CoffeeShop("StarCafe", 1, 30.5, true);
            mall.addShop(coffeeShop);

            // Adding a ClothingStore
            // Note: Ensure you have the ClothingStore class implemented similarly to CoffeeShop
            ClothingStore clothingStore = new ClothingStore("StyleZone", 2, 45.0, true);
            mall.addShop(clothingStore);

            // Searching for a CoffeeShop with a patio
            CoffeeShop found = mall.searchForCoffeeShop();
            if (found != null) {
                System.out.println("Found Coffee Shop: " + found.getName());
            } else {
                System.out.println("None is found");
            }

            System.out.println("\nMall Description:");
            System.out.println(mall.toString());

        } catch (IllegalArgumentException e) {
            System.out.println("Error creating shop: " + e.getMessage());
        }
    }
}
