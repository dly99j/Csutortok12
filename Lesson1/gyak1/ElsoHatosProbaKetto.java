//még mindig rossz...

public class ElsoHatosProbaKetto {

    public static double x = 0;
    public static int multiplier = 0;

    public static double e (double val, int acc) {

        if (acc > 0) {
            acc--;
            multiplier += 2;
            return e((1 + (1 / (1 + (1 / ((multiplier + val)))))), acc);
        } else {
            return (1 + (1 / (1 + (1 / ((multiplier + val))))));
        }
    }
    
    public static void main(String[] args) {

        System.out.println(e(x, 1000) + 1);
    }
}