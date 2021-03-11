import masodikOra.*;

public class RectMain {

    public static void inpTest(String[] args) {

        try {
            if (args.length % 4 != 0 || args.length == 0) {

                throw new IllegalArgumentException("Wrong number of arguments!");
            }
            for (String i : args) {

                double tmp = Double.parseDouble(i);
            }
        } catch (Exception e) {

            System.out.println(e);
            System.exit(1);
        }
    }

    public static Rectangle recConstructorFromStr(String strx, String stry, String strwidth, String strheight) {

        double x = Double.parseDouble(strx);
        double y = Double.parseDouble(stry);
        double width = Double.parseDouble(strwidth);
        double height = Double.parseDouble(strheight);
        return new Rectangle(x, y, width, height);
    }

    public static Rectangle[] argsRecArr(String[] args) {

        Rectangle[] rec = new Rectangle[args.length/4];
        int arrCntr = 0;
        for (int i = 0; i < args.length; i += 4) {
           
            rec[arrCntr] = recConstructorFromStr(args[i], args[i+1], args[i+2], args[i+3]);
            arrCntr++;
        }
        return rec;
    }

    public static Point[] boundingRec(Rectangle[] rec) {
        
        Point[] p = new Point[2];
        p[0] = new Point(rec[0].bottomLeft().getX(), rec[0].bottomLeft().getY());
        p[1] = new Point(rec[0].topRight().getX(), rec[0].topRight().getY());

        for (Rectangle i : rec) {

            if(p[0].getX() > i.bottomLeft().getX()) {
                p[0].setX(i.bottomLeft().getX()); 
            }
            if(p[0].getY() > i.bottomLeft().getY()) {
                p[0].setY(i.bottomLeft().getY()); 
            }
            if(p[1].getX() < i.topRight().getX()) {
                p[1].setX(i.topRight().getX());
            }
            if(p[1].getY() < i.topRight().getY()) {
                p[1].setY(i.topRight().getY()); 
            }
        }
        return p;
    }

    public static void printBoundingRec(Point[] p) {

        try {
            if (p.length != 2) throw new IllegalArgumentException();
        } catch (Exception e) {
            System.out.println(e);
            System.exit(1);
        }

        System.out.print("Bounding rectangle: ");
        System.out.println(p[0] + " - " + p[1]);
    } 
    public static void main(String[] args) {
        
        inpTest(args);
        printBoundingRec(boundingRec(argsRecArr(args)));
    }
}
