package class2;

import java.util.Comparator;
import java.util.Objects;

class Movie implements Comparable,Comparator{
    private String movieName;
    private double rating;
    private int yearOfRelease;

    public Movie(String movieName, double rating, int yearOfRelease) {
        this.movieName = movieName;
        this.rating = rating;
        this.yearOfRelease = yearOfRelease;
    }

    public String getMovieName() {
        return movieName;
    }

    public double getRating() {
        return rating;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }



    @Override
    public String toString() {
        return String.format(
                "%-25s  Rating: %.1f  Year: %d",
                movieName, rating, yearOfRelease
        );
    }

    @Override
    public int compareTo(Object o) {
        Movie t=(Movie)o;
        return this.movieName.compareTo(t.movieName);
    }

    @Override
    public int compare(Object o1, Object o2) {
        Movie m1=(Movie) o1;
        Movie m2=(Movie) o2;
        int flag=-1;
        if(m1.getYearOfRelease()<m2.getYearOfRelease())
            flag=1;
        if(m1.getYearOfRelease()>m2.getYearOfRelease())
            flag=-1;
        if(m1.getYearOfRelease()==m2.getYearOfRelease())
            flag=0;


        return flag;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return Objects.equals(movieName, movie.movieName);
    }

}

