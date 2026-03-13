public class Triangle {
    private int side1, side2, side3;

    public Triangle() {
        side1 = 3;
        side2 = 4;
        side3 = 5;
    }

    public Triangle(int s1, int s2, int s3) {
        side1 = s1;
        side2 = s2;
        side3 = s3;
    }

    public static boolean isValid(int a, int b, int c) {
        // isValid is static because it is invoked by the class itself
        if ((a + b > c) && (a + c > b) && (b + c > a)) {
            return true;
        }
        return false;
    }

    public boolean isRight() {
        if ((Math.pow(side1, 2) + Math.pow(side2, 2) == Math.pow(side3, 2)) ||
            (Math.pow(side1, 2) + Math.pow(side3, 2) == Math.pow(side2, 2)) ||
            (Math.pow(side2, 2) + Math.pow(side3, 2) == Math.pow(side1, 2))) {
            return true;
        }
        return false;
    }

    public boolean isIsosceles() {
        if ((side1 == side2) || (side1 == side3) || (side2 == side3)) {
            return true;
        }
        return false;
    }

    public boolean isEquilateral() {
        if (side1 == side2 && side2 == side3) {
            return true;
        }
        return false;
    }

    public int getPerimeter() {
        return side1 + side2 + side3;
    }

    public String toString() {
        return "(" + side1 + ", " + side2 + ", " + side3 + ")";
    }
}
