import java.util.*;

public class Kangaroo {
    
    private String name;
    private int age;

    public Kangaroo(String name, int age) {

        this.name = name;
        this.age = age;
    }

    public Kangaroo(int x) {

        System.out.println("Kangaroos have three legs");
    }

    public void display(String country) {

        System.out.println(name + " lives in " + country + " and is " + ++age + " years old.");
    }

    public static void main(String[] args) {
        
        Kangaroo k = new Kangaroo("pali", 15);
        k.display("hungary");
    }
}
