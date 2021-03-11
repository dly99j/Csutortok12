package masodikOra;

public class Point {

    private double x;
	private double y;

	public Point (double x, double y) {

		this.x = x;
		this.y = y;
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

	public void move(double dx, double dy) {

		x += dx;
		y += dy;
	}

	public void mirror(double cx, double cy) {

		x = 2 * cx - x;
		y = 2 * cy - y;
	}

    public void mirror(Point p) {

		this.x = 2 * p.x - this.x;
		this.y = 2 * p.x - this.y;
	}

    public String toString() {

        return (" (" + x + ", " + y + ')');
    }

    public double distance(Point p) {

        return (Math.sqrt(Math.pow((x - p.x), 2) + Math.pow((y - p.y), 2)));
    }
}