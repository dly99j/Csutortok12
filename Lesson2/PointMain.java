import masodikOra.*;

public class PointMain {

    public static void main(String[] args) {

        Point point = new Point(2, 2);
        point.mirror(3, 3);
        System.out.println(point);
        Point p2 = new Point(3, 3);
        point.mirror(p2);
        System.out.println(point);
        System.out.println(point.distance(p2));
    }
}