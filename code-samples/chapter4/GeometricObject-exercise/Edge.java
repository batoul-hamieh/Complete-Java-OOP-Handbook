public class Edge {
    private Point p1;
    private Point p2;

    public Edge(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public double getLength() {
        int dx = p1.getX() - p2.getX();
        int dy = p1.getY() - p2.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }

    public Point getP1() {
        return p1;
    }

    public void setP1(Point p) {
        this.p1 = p;
    }

    public Point getP2() {
        return p2;
    }

    public void setP2(Point p) {
        this.p2 = p;
    }

    @Override
    public String toString() {
        return "Edge {" + p1.toString() + ", " + p2.toString() + "}\n";
    }
}
