import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {


        B obj=new B();
        obj.method1();





        A objA; //=new A();
       // objA.method1();

        A objA1=new B();  // upcasting
        objA1.method1();
        ((B)objA1).method2();


        System.out.println(Point.Helper.x);
        Scanner sc= new Scanner(System.in);


        System.out.println("hello world");
        System.out.println(Point.Helper.x);
        Point p1=new Point();
         Point.Helper p2=p1.new Helper();
        System.out.println(p2.y);

    }
}
