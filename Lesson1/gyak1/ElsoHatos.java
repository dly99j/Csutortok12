//rossz, valamiért...

public class ElsoHatos {

    public static double x = 0;
    public static int cntr = 1;
    public static int multiplier = 0;

    public static double e (double val, int acc) {

        if (acc > 0) {
            acc--;
            if (cntr % 3 == 0) {
                cntr++;
                multiplier += 2;
                return e((1 / (multiplier + val)), acc);
            } else {
                cntr++;
                return e((1 / (1 + val)), acc);
            }
        } else {
            if (cntr % 3 == 0) {
                cntr++;
                multiplier += 2;
                return (1 / (multiplier + val));
            } else {
                return (1 / (1 + val));
            }
        }
    }
    
    public static void main(String[] args) {

        System.out.println(e(x, 10000) + 2);
    }
}