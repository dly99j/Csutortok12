public class Greeting {

    public static void main(String[] args) {

        System.console().printf("please enter your name: ");
        String str = System.console().readLine();
        System.console().printf("hello " + str + '\n');
    }
}