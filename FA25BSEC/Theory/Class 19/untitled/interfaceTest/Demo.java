package interfaceTest;

public class Demo {

    public static void main(String[] args) {

        Comparable list[]=new Comparable[5];


        list[0]=new Circle();
        list[1]=new Product();

        for(Comparable c: list)
            System.out.println(c.compare(new Circle()));



    }



}
