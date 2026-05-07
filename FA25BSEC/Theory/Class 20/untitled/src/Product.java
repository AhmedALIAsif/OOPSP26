import java.util.Comparator;

public class Product implements Comparable, Comparator {
    String name;
    double price;
    int rating;

    public Product() {
    }

    public Product(String name, double price, int rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    public int compareTo(Object other){

        Product temp=(Product)other;
        System.out.println(temp.name.compareTo(this.name));
        return 0;
    }

    public int compare(Object o1, Object o2){
        Product p1=(Product) o1;
        Product p2=(Product) o2;
        int flag;
        if(p1.price<p2.price)
            flag= 1;
        else if(p1.price>p2.price)
            flag= -1;
        else
            flag=0;

        return flag;
    }
}
