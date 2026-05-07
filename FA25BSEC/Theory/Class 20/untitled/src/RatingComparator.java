import java.util.Comparator;

public class RatingComparator implements Comparator {
    public int compare(Object o1, Object o2){
        Product p1=(Product) o1;
        Product p2=(Product) o2;
        int flag;
        if(p1.rating<p2.rating)
            flag= 1;
        else if(p1.rating>p2.rating)
            flag= -1;
        else
            flag=0;

        return flag;
    }
}
