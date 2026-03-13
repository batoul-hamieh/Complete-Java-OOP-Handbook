public class Test {
    public static void main(String[] args) {
        Object[] objects = {new Orange(), new Chicken(), new Apple()};
        
        for (int i = 0; i < objects.length; i++) {
            if (objects[i] instanceof Edible) {
                System.out.println(((Edible) objects[i]).howToEat());
            }
        }
    }
}
