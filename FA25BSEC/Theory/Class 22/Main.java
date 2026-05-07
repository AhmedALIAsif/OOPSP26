import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Utility<Number> utility=new Utility<Number>(10);

        Utility<String> utility1=new Utility<>("Text");

        Book books[]=new Book[3];
        books[0]=new Book("Java",500.0, 50);
        books[1]=new Book("python",500.0, 50);
        books[2]=new Book("c++",500.0, 50);

        Arrays.sort(books);

        System.out.println(Arrays.stream(books).toList());


        ArrayList<Book> list=new ArrayList<>(100);
        list.add(new Book("Temp",0.0,0));


    }
}
