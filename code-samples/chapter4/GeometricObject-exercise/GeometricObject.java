public class GeometricObject {
    private String color;
    private boolean filled;

    public GeometricObject() {
        this.color = "white";
        this.filled = false;
    }

    public GeometricObject(String c, boolean f) {
        color = c;
        filled = f;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String c) {
        color = c;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean f) {
        filled = f;
    }

    @Override
    public String toString() {
        /* Use the ternary operator to return "filled" if the variable is 
           true, otherwise "not filled" */
        return "Color: " + color + " " + (filled ? "filled" : "not filled");
    }
}
