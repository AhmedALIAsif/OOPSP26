package package2;

public class Demo {
    public static void main(String[] args) {
     /*   PrintIt printIt=new PrintIt();
        printIt.printThings("Hello world!");


        Printable printable=new Printable(){
            public void printThings(String text){
                System.out.println(text);
            }
        };

        printable.printThings("Hello world");
        Print(printable);

      */

        Printable printable = e->System.out.println("hello World!");

        printable.printThings("Hello World");



    }


}
