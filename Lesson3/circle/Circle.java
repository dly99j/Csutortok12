package circle;
import circle.utils.*;

public class Circle {

    private double x;
    private double y;
    private double radius;

    public Circle(double x, double y, double radius) {

        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public Circle() {

        this(0, 0, 0);
    }

    public void setRadius(double radius) {

        
        if(radius < 0) {
            throw new IllegalArgumentException();
        }
        this.radius = radius;
    }

    public double getRadius() {

        return radius;
    }

    public Point getCenter() {

        return new Point(x, y);
    }

    public double getArea() {

        return Math.pow(radius, 2) * Math.PI;
    }

    public void setX(double x) {

		this.x = x;
	}

	public void setY(double y) {

		this.y = y;
	}

    public double getX() {

		return x;
	}

	public double getY() {

		return y;
	}
}