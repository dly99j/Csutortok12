public class ElsoEgyes {

    public static void argsCheck(String[] args) {

        if (args.length == 0) {

            System.out.println("Error: no argument");
            System.exit(1);
        }
    }

    public static int sumOfDivs(int x){

        int sum = 0;
        for (int i = 1; i <= x; i++) {

            if (x % i == 0) {

                sum += i;
            }
        }
        return sum;
    }

    public static boolean isPerfect(int y) {

        if (sumOfDivs(y) / 2 == y) {

            return true;
        } else {

            return false;
        }
    }

    public static void main(String[] args) {

        argsCheck(args);
        for (String i : args) {

            if (isPerfect(Integer.parseInt(i))) {

                System.out.println(i + " is a perfect number");
            } else {

                System.out.println(i + " is not a perfect number");
            }
        }
    }
}