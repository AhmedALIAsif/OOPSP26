import java.util.Comparator;

public class Book implements Comparable<Book>, Comparator<Book> {
    String title;
    Double price;
    Integer numberOfPages;

    public Book(String title, Double price, Integer numberOfPages) {
        this.title = title;
        this.price = price;
        this.numberOfPages = numberOfPages;

    }


    @Override
    public int compareTo(Book o) {
        return this.title.compareTo(o.title);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", numberOfPages=" + numberOfPages +
                '}';
    }

    @Override
    public int compare(Book o1, Book o2) {
        return o1.price>o2.price?1:0;
    }
}
