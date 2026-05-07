import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {

        Movie[] movies = {
                new Movie("Interstellar", 8.7, 2014),
                new Movie("The Martian", 8.0, 2015),
                new Movie("Inception", 8.8, 2010),
                new Movie("Gravity", 7.7, 2013),
                new Movie("Arrival", 7.9, 2016),
                new Movie("Contact", 7.5, 1997),
                new Movie("Apollo 13", 7.7, 1995),
                new Movie("The Imitation Game", 8.0, 2014)
        };

        int a[]={1,2,3};
//        Arrays.sort(movies);
        Movie m1=new Movie("Gravity", 7.7, 2013);
       // Movie m1=movies[3];
        //Arrays.sort(movies,new Temp1());
        int index=Arrays.binarySearch(movies,0,movies.length,m1);


        System.out.println("Index "+index);
        Movie movie2[]=new Movie[10];

        //Arrays.copyOfRange(movies,0,3,movie2);

        Arrays.sort(movies,new Movie("",1,1));

        for(Movie m:movies)
        System.out.println(m);


    }
}