public class FizzBuzz {

    public static void main(String[] args) {

        final int until = 20;
        for (int i = 0; i <= until; i++) {

            if (i % 15 == 0) {

                System.out.println("FizzBuzz");
                continue;
            } else if (i % 3 == 0) {

                System.out.println("Fizz");
                continue;
            } else if (i % 5 == 0) {

                System.out.println("Buzz");
                continue;
            } else {

                System.out.println(i);
            }
        }
    }
}