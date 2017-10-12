package Module5;
import java.util.Scanner;

public class Point {
    private float x;
    private float y;

    Point(){
        this(0,0);
    }

    Point(float x, float y){
        this.x = x;
        this.y = y;
    }

    void printPoint() {
        System.out.println("(" + x + ";" + y + ")");
    }

    void setPoint(float x, float y) {
        this.x = x;
        this.y = y;
    }

    void inputPoint() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите абсциссу: ");
        float x = in.nextFloat();
        System.out.print("Введите ординату: ");
        float y = in.nextFloat();
        setPoint(x,y);
    }

    float calcLength(Point otherPoint){
        return (float) Math.sqrt((float)Math.pow(x - otherPoint.x, 2) + Math.pow(y - otherPoint.y, 2));
    }

}
