Triangle triangle1 = new Triangle();
/* To create an object of class Triangle, note that in this
command:
Triangle : reference type
triangle1 : object reference type
Triangle() : no-arg constructor that initializes an object */

Triangle triangle2 = new Triangle(4, 5, 6);
/* another object of class Triangle is created using
constructor with arguments
where side1 = 4 cm, side2 = 5 cm, and side3 = 6 cm */

System.out.println("Triangle 1: ");
System.out.println("The area is " + triangle1.area());
// triangle1.area() : to invoke object's method
System.out.println("The perimeter is " + triangle1.perimeter());

System.out.println("Triangle 2: ");
System.out.println("The area is " + triangle2.area());
System.out.println("The perimeter is " + triangle2.perimeter());
}
}
