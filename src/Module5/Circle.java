package Module5;

import java.util.Scanner;

public class Circle {
    private Point point;
    private float radius;

    public Circle(Point point, float radius) {
        this.point = point;
        this.radius = radius;
    }

    boolean collisionCheck(Circle otherCircle){
        return radius + otherCircle.radius == point.calcLength(otherCircle.point);
    }

    public void inputData(){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите абсциссу: ");
        float x = in.nextFloat();
        System.out.print("Введите ординату: ");
        float y = in.nextFloat();
        point.setPoint(x,y);
        System.out.print("Введите радиус: ");
        radius = in.nextFloat();
    }

    public void setPoint(Point point){
        this.point = point;
    }

    public void setRadius(float radius){
        this.radius = radius;
    }

    public Point getPoint(){
        return point;
    }

    public float getRadius(){
       return radius;
    }
}
