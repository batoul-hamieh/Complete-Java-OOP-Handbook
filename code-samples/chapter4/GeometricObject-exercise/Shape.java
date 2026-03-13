public class Shape extends GeometricObject {
    private Edge[] edges;

    public Shape(int nbOfEdges, String color, boolean filled) {
        super(color, filled);
        edges = new Edge[nbOfEdges];
        for (int i = 0; i < edges.length; i++) {
            Point p1 = new Point((int) (Math.random() * 21), (int) (Math.random() * 21));
            Point p2 = new Point((int) (Math.random() * 21), (int) (Math.random() * 21));
            edges[i] = new Edge(p1, p2);
        }
    }

    public double getPerimeter() {
        double p = 0;
        for (int i = 0; i < edges.length; i++) {
            p += edges[i].getLength();
        }
        return p;
    }

    public Edge[] getEdges() {
        return edges;
    }

    @Override
    public String toString() {
        String s = "Shape with " + edges.length + " edges\n" +
                   super.toString() + "\nEdges:\n";
        for (int i = 0; i < edges.length; i++) {
            s += edges[i].toString();
        }
        return s;
    }
}
