public class Test {
    public static void main(String[] args) {

        System.out.println("Before creating objects: ");
        System.out.println("The nb of Circle objects is " + Circle.nbOfObjects); 
        // access the static variable via class name

        Circle circle1 = new Circle(1);
        System.out.println("After creating circle1: ");
        System.out.println("The nb of Circle objects is " + circle1.nbOfObjects); 
        // access nbOfObjects via circle1 object

        Circle circle2 = new Circle(5);
        System.out.println("After creating circle2: ");
        System.out.println("The nb of Circle objects is " + circle2.nbOfObjects); 
        // output: The nb of Circle objects is 2

        System.out.println("The nb of Circle objects is " + Circle.nbOfObjects); 
        // output: The nb of Circle objects is 2
    }
}
