package Module5;

import java.util.ArrayList;
import java.util.Random;

public class CircleGenerator {

    private ArrayList<Circle> circleArray = new ArrayList<>();

    public void generate(int countOfCircles) {
        for (int i = 0; i < countOfCircles; i++) {
            Random random = new Random();
            float radius = random.nextFloat();

            float centerX = random.nextInt();
            float centerY = random.nextInt();

            Point center = new Point(centerX, centerY);
            Circle rndCircle = new Circle(center, radius);

            circleArray.add(rndCircle);
        }
    }
}
