public class ElsoHarmas {

    public static void argsCheck(String[] args) {

        if (args.length == 0) {

            System.out.println("Error: no argument");
            System.exit(1);
        }
    }
    
    public static int smallestNum(String[] arr) {

        int smallest = Integer.parseInt(arr[0]);
        for (String i : arr) {
            
            if (Integer.parseInt(i) < smallest) { 
                
                smallest = Integer.parseInt(i); 
            }
        }
        return smallest;
    }

    public static int largestDiv(String[] arr) {

        int top = smallestNum(arr);
        int divCntr = 0;
        while(true) {

            for (int i = 0; i < arr.length; i++) {

                if (Integer.parseInt(arr[i]) % top == 0) { divCntr++; }
            }
            if (divCntr == arr.length) { break; }
            top--;
            divCntr = 0;
        }
        return top;
    }

    public static void main(String[] args) {

        argsCheck(args);
        System.out.println(largestDiv(args));
    }
}