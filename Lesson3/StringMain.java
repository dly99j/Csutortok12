import stringutils.*;
import java.util.*;

public class StringMain {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("please enter a string: ");
        String str = sc.nextLine();
        System.out.println("the characters of the string: ");
        IterLetter it = new IterLetter(str);
        while(it.hasNext()) { it.printNext(); }
    }
}