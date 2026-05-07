package class2;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {

        Box b1=new Box(4);
        Box b2=new Box("String box");
        Box b3=new Box(4.6);
        String s2=(String) b2.getO();


        Box<String> b4=new Box<>("New String Box");
        String s4=b4.getO();

        Box<Movie> movieBox[]=new Box[5];

        Box<Movie> b6=new Box<>(new Movie("t",1,1));

        Arrays.sort(movieBox);


        // 1,2,3
        // 1.3, 3.4
        

    }
}
