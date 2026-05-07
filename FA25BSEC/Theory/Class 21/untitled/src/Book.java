import java.util.Comparator;

public class Book implements Comparable, Comparator {
    String title;
    double price;
    int numberOfPages;

    public Book(String title, double price, int numberOfPages) {
        this.title = title;
        this.price = price;
        this.numberOfPages = numberOfPages;
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
    public int compareTo(Object other){

        Book otherBook=(Book) other;

        return this.title.compareTo(otherBook.title);
    }
    @Override
    public int compare(Object o1, Object o2){
        Book b1=(Book)o1;
        Book b2=(Book) o2;
        int f=-1;
        if(b1.price>b2.price)
            f=1;
        if(b1.price==b2.price)
            f=0;
        if(b1.price<b2.price)
            f=-1;
        return f;

    }
}
