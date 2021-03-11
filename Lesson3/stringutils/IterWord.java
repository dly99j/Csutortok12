package stringutils;
import java.util.*;

public class IterWord {
    
    private String sentence;
    private List<String> words;
    private int iter;

    public IterWord(String s) {

        sentence = s;
        words = Arrays.asList(s.split("\\s+"));
        iter = 0;
    }

    public void printNext() {

        try {
            if (this.hasNext() == false) throw new IndexOutOfBoundsException();
            System.out.println(words.get(iter));
            iter++;
        } catch (Exception e) {
            System.out.println("no more characters left");
        }
    }

    public Boolean hasNext() {

        if (iter == words.size()) {
            return false;
        } else {
            return true;
        }
    }

    public void restart() {

        iter = 0;
    }

}
