public class ArgsGreeting {

    public static void main(String[] args) {

        if(args.length == 0) { 
            
            System.out.println("error, no name"); 
        } else {

            System.out.print("hello ");
            for (String i : args) {

                System.out.print(i + ' ');
            }
        }
        System.out.println();
    }
}