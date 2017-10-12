package ModuleFive1;

public class Point {
    public static final Point ZERO = new Point(0,0);
    private double x, y;

    public Point(){
        this(0,0);
    }

    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double calcLength(Point otherPoint){
        return Math.sqrt(Math.pow(x - otherPoint.x, 2) + Math.pow(y - otherPoint.y, 2));
    }

    public double calcLength(){
       return calcLength(ZERO);
    }

    public Point normalize(){
        return new Point(x / calcLength(), y / calcLength());
    }

    public Point multiply(double value) {
        return new Point(x * value, y * value);
    }

    public Point minus(Point p) {
        return new Point(x - p.x, y - p.y);
    }

    public Point plus(Point p) {
        return new Point(x + p.x, y + p.y);
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}
