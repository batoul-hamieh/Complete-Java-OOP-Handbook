public class GeometricObject {
    private String color;
    private boolean filled;

    public GeometricObject() {
        color = "white";
        filled = false;
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
        String s = "The color is " + color;
        if (filled) {
            s += "\nThe geometric object is filled";
        } else {
            s += "\nThe geometric object is not filled";
        }
        return s;
    }
}
