package circle;
import circle.utils.Point;
import java.util.*;

public class CircleMain {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Circle c = new Circle();
        c.setX(5);
        c.setY(2);
        try {
            c.setRadius(-10);
            System.out.println("radius set successfully");
        } catch (Exception e) {
            System.out.println("radius must be positive. \nplease provide one:");
            double r = sc.nextDouble();
            c.setRadius(r);
        }
        System.out.println("area of the circle: " + c.getRadius());
    }
}