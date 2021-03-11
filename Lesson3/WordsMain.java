import stringutils.*;
import java.util.*;

public class WordsMain {
    
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("please enter a sentence: ");
        String str = sc.nextLine();
        System.out.println("the words of the sentence: ");
        var it = new IterWord(str);
        while(it.hasNext()) { it.printNext(); }
    }
}
