package library;

public class Book {
    
    private String title;
    private String writer;
    private int dateOfRelease;
    private int length;
    private Boolean available;

    public Book(){}

    public Book (String title, String writer, int dateOfRelease, int length, Boolean available) {

        this.title = title;
        this.writer = writer;
        this.dateOfRelease = dateOfRelease;
        this.length = length;
        this.available = available;
    }

    public Book (Book book) {

        try {

            if (book == null) {

                throw new IllegalArgumentException();
            }
            title = book.title;
            writer = book.writer;
            dateOfRelease = book.dateOfRelease;
            length = book.length;
            available = book.available;
        } catch (Exception e) {

            System.err.println(e);
        }
    }

    public String toString() {

        if (available == true) {
            return title + ", written by: " + writer + ", released in " + dateOfRelease + ". " + length + " pages long, and is available";
        } else {
            return title + ", written by: " + writer + ", released in " + dateOfRelease + ". " + length + " pages long, and is not available";
        }
    }

    public Boolean equals(Book b) {

        if (title.equals(b.title) && writer.equals(b.writer) && dateOfRelease == b.dateOfRelease && length == b.length) {
            return true;
        } else {
            return false;
        }
    }

}
