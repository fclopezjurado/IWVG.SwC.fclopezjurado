package es.upm.miw.swc;

public class Point {
    private int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(int xy) {
        this(xy, xy);
    }

    public Point() {
        this(0, 0);
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public double module() {
        return Math.sqrt(this.x * this.x + this.y * this.y);
    }

    public double phase() {
        return Math.atan((double) this.y / this.x);
    }

    public void translateOrigin(Point origin) {
        this.x -= origin.getX();
        this.y -= origin.getY();
    }

    @Override
    public String toString() {
        return "Point[" + x + "," + y + "]";
    }
    
    public Point diff (Point point1, Point point2) {
        return (new Point (point1.getX()-point2.getX(),point1.getY()-point2.getY()));
    }

}
