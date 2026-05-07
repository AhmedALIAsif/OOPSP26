public class Main {
    public static void main(String[] args) {

        Product list[]=new Product[10];
        list[0]=new Product("laptop",20000,3);
        list[1]=new Product("Keyboard",10000,3);
        list[2]=new Product("Wire",10000,3);


        list[0].compareTo(list[1]);
        System.out.println(list[0].compare(list[0],list[1]));








    }
}
