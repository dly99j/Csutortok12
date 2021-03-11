package library;

import library.Book;

public class BookMain {
    
    public static void main(String[] args) {
        
        Book b2 = new Book("cím", "szerző", 1970, 666, true);
        Book b3 = b2;
        System.out.println(b2.toString());;
        System.out.println(b3.equals(b2));
        Book b = null;
        Book b1 = new Book(b);
    }
}
