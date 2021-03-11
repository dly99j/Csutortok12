import java.util.Scanner;

public class ElsoNegyes {

    static Scanner scan = new Scanner(System.in);

    public static double askInputNum () {

        System.out.print("input number: ");
        double inNum = scan.nextDouble();
        return inNum;
    }

    public static double askInputAcc () {

        System.out.print("square root accuracy: ");
        double inAcc = scan.nextDouble();
        return inAcc;
    }

    public static double sqrtBabylonian (double inNum, double inAcc) {

        double x = inNum/2;
        while (true) {

            double tmpx = x;
            x = 0.5 * (tmpx + inNum/tmpx);
            if (tmpx - x < inAcc) { break; }
        }
        return x;
    }

    public static void main(String[] args) {

        double inNum = askInputNum();
        double inAcc = askInputAcc();
        System.out.println(sqrtBabylonian(inNum, inAcc));
    }
}