package ModuleFive1;

import javafx.scene.layout.Pane;

public class Triangle {
    private Line l1, l2, l3;

    public Triangle(Point A, Point B, Point C){
        l1 = new Line(A, B);
        l2 = new Line(B, C);
        l3 = new Line(C, A);
    }

    public void draw(Pane root){
        l1.show(root);
        l2.show(root);
        l3.show(root);
    }

    public void clear(Pane root){
        l1.clear(root);
        l2.clear(root);
        l3.clear(root);
    }

    public Line getL1() {
        return l1;
    }

    public Line getL2() {
        return l2;
    }

    public Line getL3() {
        return l3;
    }
}
