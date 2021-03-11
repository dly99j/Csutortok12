package stringutils;

public class IterLetter {

    private String str;
    private int iter = 0;

    public IterLetter(String str) {

        this.str = str;
    }

    public Boolean hasNext() {

        if (iter == str.length()) {
            return false;
        } else {
            return true;
        }
    }

    public void printNext() {

        try {
            if (this.hasNext() == false) throw new IndexOutOfBoundsException();
            System.out.println(str.charAt(iter));
            iter++;
        } catch (Exception e) {
            System.out.println("no more characters left");
        }
    }

    public void restart() {

        iter = 0;
    }
}