import java.util.Comparator;

public class Temp1 implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Movie m1=(Movie) o1;
        Movie m2=(Movie) o2;
        int flag=-1;
        if(m1.getRating()<m2.getRating())
            flag=1;
        if(m1.getRating()>m2.getRating())
            flag=-1;
        if(m1.getRating()==m2.getRating())
            flag=0;


        return flag;
    }
}
