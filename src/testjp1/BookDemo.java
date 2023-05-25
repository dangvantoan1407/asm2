package testjp1;

public class BookDemo {
    public static void main(String[] args) {
        Author author = new Author("Đặng Văn ", "Toàn");
        Book book = new Book("BookJava" ,author ,79.75);
        System.out.println(book.toString());

    }
}
