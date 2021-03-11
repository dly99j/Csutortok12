public class ElsoKettes {

    public static void argsCheck(String[] args) {

        if (args.length == 0 || args.length > 1) {

            System.out.println("Error: no or too many arguments");
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
        /*for (String i : args) {

            if (isPerfect(Integer.parseInt(i))) {

                System.out.println(i + " is a perfect number");
            } else {

                System.out.println(i + " is not a perfect number");
            }
        }*/
        for (int i = 1; i < Integer.parseInt(args[0]); i++) {

            if (isPerfect(i)) {

                System.out.println(i + " is a perfect number");
            } else {

                System.out.println(i + " is not a perfect number");
            }
        }
    }
}