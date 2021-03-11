package masodikOra;

public class Rectangle {

    //ezek igazából feleslegesek, de a feladat kérte, hogy tároljam el
    private double x;
    private double y;
    private double width;
    private double height;

    private Point[] coords = new Point[4];

    public Rectangle(double x, double y, double width, double height) {

        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        coords[0] = new Point(x, y);
        coords[1] = new Point(x, y + height);
        coords[2] = new Point(x + width, y);
        coords[3] = new Point(x + width, y + height);
    }

    public Point topLeft() {

        if (coords[0].getX() < coords[2].getX()) {

            if (coords[0].getY() > coords[1].getY()) {
                return coords[0];
            } else {
                return coords[1];
            }
        } else {

            if (coords[2].getY() > coords[3].getY()) {
                return coords[2];
            } else {
                return coords[3];
            }
        }
    }

    public Point bottomLeft() {

        if (coords[0].getX() < coords[2].getX()) {

            if (coords[0].getY() < coords[1].getY()) {
                return coords[0];
            } else {
                return coords[1];
            }
        } else {

            if (coords[2].getY() < coords[3].getY()) {
                return coords[2];
            } else {
                return coords[3];
            }
        }
    }

    public Point topRight() {

        if (coords[0].getX() > coords[2].getX()) {

            if (coords[0].getY() > coords[1].getY()) {
                return coords[0];
            } else {
                return coords[1];
            }
        } else {

            if (coords[2].getY() > coords[3].getY()) {
                return coords[2];
            } else {
                return coords[3];
            }
        }
    }

    public Point bottomRight() {

        if (coords[0].getX() > coords[2].getX()) {

            if (coords[0].getY() < coords[1].getY()) {
                return coords[0];
            } else {
                return coords[1];
            }
        } else {

            if (coords[2].getY() < coords[3].getY()) {
                return coords[2];
            } else {
                return coords[3];
            }
        }
    }
}