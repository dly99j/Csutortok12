import masodikOra.*;

public class Distance {
    
    public static void inpTest(String[] args) {

        try {
            if (args.length % 2 != 0 || args.length == 0) {

                throw new IllegalArgumentException("Wrong number of arguments!");
            }
            for (String i : args) {

                double tmp = Double.parseDouble(i);
            }
        } catch (Exception e) {

            System.out.println(e);
            System.exit(0);
        }
    }

    public static Point pointConstFromStr(String strx, String stry) {

        double x = Double.parseDouble(strx);
        double y = Double.parseDouble(stry);
        return new Point(x, y);
    }

    public static Point[] argsPointArr(String[] args) {

        Point p[] = new Point[args.length/2];
        int argsCntr = 0;
        for (int i = 0; i < args.length; i += 2) {

            p[argsCntr] = pointConstFromStr(args[i], args[i+1]);
            argsCntr++;
        }
        return p;
    }

    public static double pArrDist(Point[] p) {

        double dist = 0;
        Point curr = p[0];
        for (Point i : p) {

            dist += curr.distance(i);
            curr = i;
        }
        return dist;
    }

    public static void main(String[] args) {
        
        inpTest(args);
        System.out.println(pArrDist(argsPointArr(args)));
    }
}
