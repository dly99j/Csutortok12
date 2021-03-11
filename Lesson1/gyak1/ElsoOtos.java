public class ElsoOtos {

    public static double x = 0;

    public static double sqrtTwo (double val, int acc) {

        if (acc > 0) {
            acc--;
            return sqrtTwo((1 / (2 + val)), acc);
        } else {
            return (1 / (2 + val));
        }
    }

    public static void main(String[] args) {

        System.out.println(sqrtTwo(x, 10000) + 1);
    }
}