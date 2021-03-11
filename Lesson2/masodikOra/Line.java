package masodikOra;

public class Line {
    
    public double a, b, c;

    //szinte biztos, hogy a matek rossz, este, fáradtan írtam és belekavarodtam többször is

    public Boolean contains(Point p) {

        if (a * p.getX() == b * p.getY() + c) {
            return true;
        } else {
            return false;
        }
    }

    public Boolean isParallelWith(Line l) {

        if (a / b == l.a / l.b) {
            return true;
        } else {
            return false;
        }
    }

    public Boolean isOrthogonalWith(Line l) {

        if (a * l.a == -1) {
            return true;
        } else {
            return false;
        }
    }
}
