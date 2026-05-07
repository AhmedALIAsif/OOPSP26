public class Main {
    public static void main(String[] args) {

        Shape s1;
        s1=new Circle();
        s1.draw();

        s1=new Rectangle();
        s1.draw();

        s1.erase();
        System.out.println(s1.x);
        System.out.println(s1.y);


        s1.moveLeft(s1, 10);

        System.out.println(s1.x);


    }
}
