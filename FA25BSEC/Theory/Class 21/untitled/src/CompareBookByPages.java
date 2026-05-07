import java.util.Comparator;

public class CompareBookByPages implements Comparator {
    @Override
    public int compare(Object o1, Object o2){
        Book b1=(Book)o1;
        Book b2=(Book) o2;
        int f=-1;
        if(b1.numberOfPages>b2.numberOfPages)
            f=1;
        if(b1.numberOfPages==b2.numberOfPages)
            f=0;
        if(b1.numberOfPages<b2.numberOfPages)
            f=-1;
        return f;

    }
}
