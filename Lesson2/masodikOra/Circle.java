package masodikOra;

public class Circle {
    
    public Point centre;
    double radius;
    
    public void enlarge(double f) {

        radius *= f;
    }

    public double getArea() {

        return Math.PI * Math.pow(radius, 2);
    }
}
