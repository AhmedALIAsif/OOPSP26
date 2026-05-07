import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Book books[]=new Book[3];
        books[0]=new Book("java",1000,200);
        books[1]=new Book("C++",9000,700);
        books[2]=new Book("Python",500,300);

     //   Arrays.sort(books);
     //   Arrays.sort(books,books[1]);
        Arrays.sort(books,new CompareBookByPages());

        for(Book b:books)
            System.out.println(b);




    }
}
